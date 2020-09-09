package com.aha.shardingjdbc.module.user.controller;

import com.aha.shardingjdbc.module.user.entity.TUser;
import com.aha.shardingjdbc.module.user.service.TUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户表（根据用户id分表）(TUser)表控制层
 *
 * @author ahamzh
 * @since 2020-09-09 00:43:48
 */
@RestController
@RequestMapping("tUser")
public class TUserController {
    /**
     * 服务对象
     */
    @Resource
    private TUserService tUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TUser selectOne(Long id) {
        return this.tUserService.queryById(id);
    }

    @GetMapping("/insetUsers")
    public void insetUsers() throws Exception {
        tUserService.insertUsers();
    }
}