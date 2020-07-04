package com.brother.support.service;

import com.brother.support.domain.UserInfo;

import java.util.List;

/**
 * @Desc
 * @reason liguotao
 * 20/7/4
 */
public interface UserInfoService {


    UserInfo qryUserInfoByUserName(String userName);

    List<UserInfo> qryUserInfoList();
    public void addUserInfo(UserInfo userInfo);
}
