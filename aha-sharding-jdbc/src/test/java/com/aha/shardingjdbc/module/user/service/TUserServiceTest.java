package com.aha.shardingjdbc.module.user.service;

import com.aha.shardingjdbc.AhaShardingJdbcApplicationTests;
import com.aha.shardingjdbc.module.user.entity.TUser;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

public class TUserServiceTest extends AhaShardingJdbcApplicationTests {

    @Autowired
    private TUserService tUserService;

    @Test
    public void test() throws Exception {
        tUserService.insertUsers();
    }

}