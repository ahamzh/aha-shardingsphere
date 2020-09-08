package com.aha.shardingjdbc.module.user.dao;

import com.aha.shardingjdbc.AhaShardingJdbcApplicationTests;
import com.aha.shardingjdbc.module.user.entity.TUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

public class TUserDaoTest extends AhaShardingJdbcApplicationTests {

    @Autowired
    private TUserDao tUserDao;

    @Test
    public void insertUser() {
        for (int i = 80; i < 100; i++) {
            tUserDao.insert(TUser.builder().userName("第" + i + "个用户").userAge(16 + i).userInfo("用户信息").build());
        }
    }
}