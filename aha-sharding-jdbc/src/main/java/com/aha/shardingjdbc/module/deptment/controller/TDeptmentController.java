package com.aha.shardingjdbc.module.deptment.controller;

import com.aha.shardingjdbc.module.deptment.entity.TDeptment;
import com.aha.shardingjdbc.module.deptment.service.TDeptmentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 部门表（用hint根据部门名称分表）(TDeptment)表控制层
 *
 * @author makejava
 * @since 2020-09-09 00:04:19
 */
@RestController
@RequestMapping("tDeptment")
public class TDeptmentController {
    /**
     * 服务对象
     */
    @Resource
    private TDeptmentService TDeptmentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TDeptment selectOne(Long id) {
        return this.TDeptmentService.queryById(id);
    }

}