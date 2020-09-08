package com.aha.shardingjdbc.module.deptment.dao;

import com.aha.shardingjdbc.AhaShardingJdbcApplicationTests;
import com.aha.shardingjdbc.module.deptment.entity.TDeptment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

public class TDeptmentDaoTest extends AhaShardingJdbcApplicationTests {

    @Autowired
    private TDeptmentDao tDeptmentDao;

    @Test
    public void insertDept() {
        tDeptmentDao.insert(TDeptment.builder().deptmentName("第一个部门").deptmentInfo("第一个部门描述").build());
    }
}