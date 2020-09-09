package com.aha.shardingjdbc.module.deptment.service;

import com.aha.shardingjdbc.AhaShardingJdbcApplicationTests;
import com.aha.shardingjdbc.module.deptment.entity.TDeptment;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TDeptmentServiceTest extends AhaShardingJdbcApplicationTests {

    @Autowired
    private TDeptmentService tDeptmentService;

    @Test
    public void test() {
        for (int i = 30; i < 50; i++) {
            TDeptment tDeptment = TDeptment.builder().areaCode((i - 30) / 10 + "").deptmentName("第" + i + "个部门").deptmentInfo("部门信息").build();
//            tDeptment.setId(IdWorker.getId(tDeptment));
            tDeptmentService.insert(tDeptment);
        }

//        tDeptmentService.deleteById(510397210949582848L);
    }

    @Test
    public void test11() throws JsonProcessingException {
        JsonMapper jsonMapper = new JsonMapper();
        System.out.println(jsonMapper.writeValueAsString(tDeptmentService.selectUserWithDept("1", 1303586943759319041L, 1303586525599834113L)));
    }

}