package com.brother.support.service.impl;

import com.brother.support.domain.UserInfo;
import com.brother.support.domain.UserInfoExample;
import com.brother.support.mapper.UserInfoMapper;
import com.brother.support.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Desc
 * @reason
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public boolean checkUserInfo(UserInfo userInfo) throws Exception {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUserNameEqualTo(userInfo.getUserName()).andPasswordEqualTo(userInfo.getPassword());
        List<UserInfo> userInfos = userInfoMapper.selectByExample(userInfoExample);
        if (userInfos == null || userInfos.size()==0) {
            throw new Exception("用户名或密码不存在");
        }

        return false;
    }
}
