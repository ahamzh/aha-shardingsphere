package com.halo.shardingjdbc.module.deptment.dao;

import com.halo.shardingjdbc.HaloShardingJdbcApplicationTests;
import com.halo.shardingjdbc.module.deptment.entity.TDeptment;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.google.common.collect.Maps;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

public class TDeptmentDaoTest extends HaloShardingJdbcApplicationTests {

    @Autowired
    private TDeptmentDao tDeptmentDao;

    @Test
    public void insertDept() {
        tDeptmentDao.insert(TDeptment.builder().deptmentName("第一个部门").deptmentInfo("第一个部门描述").build());
    }

    @Test
    public void selectJoin() throws JsonProcessingException {
        JsonMapper jsonMapper = new JsonMapper();
//        System.out.println(jsonMapper.writeValueAsString(tDeptmentDao.selectUserWithDept()));
//        System.out.println(jsonMapper.writeValueAsString(tDeptmentDao.selectDeptByAreaCode("1")));
        HashMap<String, Object> map = Maps.newHashMap();
        map.put("area_code", "1");
        System.out.println(jsonMapper.writeValueAsString(tDeptmentDao.selectByMap(map)));
    }
}