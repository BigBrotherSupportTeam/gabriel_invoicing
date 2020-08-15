package com.brother.support.aop;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.brother.support.domain.OperationLogRecord;
import com.brother.support.domain.UserInfo;
import com.brother.support.mapper.OperationLogRecordMapper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Desc
 * @reason liguotao
 * 20/7/7
 */
@Aspect
@Component
public class OperationLog {
    @Autowired
    private OperationLogRecordMapper operationLogRecordMapper;

    /**
     * 表达式：全限定方法名    访问修饰符 返回值 包名.包名.包名.类名.方法名（参数列表）
     *
     * 格式一：全匹配方式：
     * public void  com.brother.support.service.impl.LoginServiceImpl.checkUserInfo(com.brother.support.domain.UserInfo)
     * 格式二：访问符可以省略；
     * void  com.brother.support.service.impl.LoginServiceImpl.checkUserInfo(com.brother.support.domain.UserInfo)
     * 格式三：返回值可以使用*，表示任意返回值
     *     *  com.brother.support.service.impl.LoginServiceImpl.checkUserInfo(com.brother.support.domain.UserInfo)
     * 格式四：包名可以使用“.”表示任意包，但是有几级包，必须写几个
     *      *  .....LoginServiceImpl.checkUserInfo(com.brother.support.domain.UserInfo)
     * 格式五：包名可以使用“..” 表示当前包及其子包
     *      *  ..LoginServiceImpl.checkUserInfo(com.brother.support.domain.UserInfo)
     *
     * 格式六：类名和方法名可以使用“.”，表示任意类，任意方法
     *      *  ...(com.brother.support.domain.UserInfo)
     * 格式七：参数列表，可以使用具体类型
     *      基本类型可以直接写类型名称：int
     *      引用类型必须写全限定类名：java.lang.String
     * 格式八：参数列表可以使用“*”，表示任意类型的参数，但是必须有参数
     *      * *..*.*(*)
     * 格式九：参数列表可以使用“..”,表示有无参数都可，有参数可以是任意类型
     *      * *..*.*(..)
     * 格式shi：
     *      * *..*.*(..)
     */
    @Pointcut("execution(public *  com.brother.support.service.impl.LoginServiceImpl.checkUserInfo(com.brother.support.domain.UserInfo))")
    public void pointcut() {


    }


    @Around("pointcut()")
    public Object aroundPrintLog(ProceedingJoinPoint pjp){
        //定义一个返参
        Object rtValue = null;
        //获取参数
        Object[] args = pjp.getArgs();
        Signature signature = pjp.getSignature();
        MethodSignature methodSignature = (MethodSignature)signature;
        Method targetMethod = methodSignature.getMethod();
        String dateFormat = "yyyy-MM-dd HH:mm:ss";
        String params = JSONObject.toJSONStringWithDateFormat(pjp.getArgs(), dateFormat, SerializerFeature.WriteMapNullValue);
        Map<String, Object> keyAndValue = getKeyAndValue(args[0]);

        System.out.println(keyAndValue.entrySet().toString());
        try {
            System.out.println("前置通知");
            rtValue = pjp.proceed();
            OperationLogRecord operationLogRecord = new OperationLogRecord();
            operationLogRecord.setMethodName(targetMethod.getName());
            operationLogRecord.setReqParam(keyAndValue.entrySet().toString());
            operationLogRecord.setRspParam(rtValue.toString());
            operationLogRecordMapper.insert(operationLogRecord);
            System.out.println("后置通知");
        } catch (Throwable throwable) {
            System.out.println("异常通知");
            throwable.printStackTrace();
        }finally {
            System.out.println("finally...");
        }
        return  rtValue;
    }



    public static Map<String, Object> getKeyAndValue(Object obj) {
        Map<String, Object> map = new HashMap<>();
        // 得到类对象
        Class userCla = (Class) obj.getClass();
        /* 得到类中的所有属性集合 */
        Field[] fs = userCla.getDeclaredFields();
        for (int i = 0; i < fs.length; i++) {
            Field f = fs[i];
            f.setAccessible(true); // 设置些属性是可以访问的
            Object val = new Object();
            try {
        //获取属性的get方法名
                String fieldGetName = parGetName(f.getName());
                Method fieldGetMet = obj.getClass().getMethod(fieldGetName, new Class[]{});
                Object fieldVal = fieldGetMet.invoke(obj, new Object[]{});
                map.put(f.getName(), fieldVal);// 设置键值
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return map;
    }



    /**
     * 拼接某属性的 get方法
     *
     * @param fieldName
     * @return String
     */
    private static String parGetName(String fieldName) {
        if (null == fieldName || "".equals(fieldName)) {
            return null;
        }
        return "get" + fieldName.substring(0, 1).toUpperCase()
                + fieldName.substring(1);
    }
}
