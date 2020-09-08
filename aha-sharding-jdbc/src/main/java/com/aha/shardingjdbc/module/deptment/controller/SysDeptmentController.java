package com.aha.shardingjdbc.module.deptment.controller;

import com.aha.shardingjdbc.module.deptment.entity.SysDeptment;
import com.aha.shardingjdbc.module.deptment.service.SysDeptmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 部门信息(SysDeptment0)表控制层
 *
 * @author zhihao.mao
 * @since 2020-09-08 17:16:54
 */
@RestController
@RequestMapping("sysDeptment")
public class SysDeptmentController {
    /**
     * 服务对象
     */
    @Resource
    private SysDeptmentService sysDeptment0Service;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysDeptment selectOne(Integer id) {
        return this.sysDeptment0Service.queryById(id);
    }

}