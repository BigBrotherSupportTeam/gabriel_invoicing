package com.brother.support.service.impl;

import com.brother.support.domain.UserInfo;
import com.brother.support.domain.UserInfoExample;
import com.brother.support.mapper.UserInfoMapper;
import com.brother.support.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Desc
 * @reason liguotao
 * 20/7/4
 */
@Service
@Slf4j
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * Cacheable 主要用于数据查询
     * CachePut 主要用于数据更新，即放到update操作的方法
     * CacheEvict 主要用于数据删除，即放到delete操作方法上
     *
     * unless = "#result==null"  表示如果结果为空，则不放入缓存
     */
    @Override
    @Cacheable(cacheNames = "userInfo",unless = "#result==null")
    public UserInfo qryUserInfoByUserName(String userName) {

        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUserNameEqualTo(userName);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(userInfoExample);
        if (userInfos != null && userInfos.size()>0) {
            return userInfos.get(0);
        }
        return null;
    }

    @Override
    public List<UserInfo> qryUserInfoList() {
        List<UserInfo> userInfos = userInfoMapper.selectByExample(null);
        return userInfos;
    }
    @Override
    public void addUserInfo(UserInfo userInfo) {
        userInfoMapper.insert(userInfo);
    }

}
