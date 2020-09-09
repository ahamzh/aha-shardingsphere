package com.aha.shardingjdbc.module.user.dao;

import com.aha.shardingjdbc.AhaShardingJdbcApplicationTests;
import com.aha.shardingjdbc.module.user.entity.TUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TUserDaoTest extends AhaShardingJdbcApplicationTests {

    @Autowired
    private TUserDao tUserDao;

    @Test
    public void insertUser() {
        for (int i = 20; i < 50; i++) {
            tUserDao.insert(TUser.builder().deptId(1303586525599834113L).userName("第" + i + "个用户").userAge(16 + i).userInfo("用户信息").build());
        }
    }

    @Test
    public void selectUser() {

    }
}