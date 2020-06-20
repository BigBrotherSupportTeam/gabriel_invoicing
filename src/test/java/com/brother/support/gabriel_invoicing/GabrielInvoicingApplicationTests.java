package com.brother.support.gabriel_invoicing;

import com.brother.support.domain.UserInfo;
import com.brother.support.mapper.UserInfoMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class GabrielInvoicingApplicationTests {
    @Autowired
    private UserInfoMapper userInfoMapper;


    @Test
    void contextLoads() {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(1);
        System.out.println(userInfo);
    }

}
