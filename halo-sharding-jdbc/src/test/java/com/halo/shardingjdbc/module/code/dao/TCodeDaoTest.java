package com.halo.shardingjdbc.module.code.dao;

import com.halo.shardingjdbc.HaloShardingJdbcApplicationTests;
import com.halo.shardingjdbc.module.code.entity.TCode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

public class TCodeDaoTest extends HaloShardingJdbcApplicationTests {

    @Autowired
    private TCodeDao tCodeDao;

    @Test
    public void test() {
        //不配置默认使用第一个数据源
        tCodeDao.insert(TCode.builder()
//                .id(IdWorker.getId())
                .codeName("第一个codeName").build());
    }

    @Test
    public void test11(){
        tCodeDao.selectByMap(new HashMap<>());
    }
}