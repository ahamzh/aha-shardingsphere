package com.halo.shardingjdbc.module.user.service;

import com.halo.shardingjdbc.HaloShardingJdbcApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TUserServiceTest extends HaloShardingJdbcApplicationTests {

    @Autowired
    private TUserService tUserService;

    @Test
    public void test() throws Exception {
        tUserService.insertUsers();
    }

}