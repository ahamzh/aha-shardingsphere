package com.halo.shardingjdbc.module.code.controller;

import com.halo.shardingjdbc.module.code.entity.TCode;
import com.halo.shardingjdbc.module.code.service.TCodeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (TCode)表控制层
 *
 * @author zhihao.mao
 * @since 2020-09-09 15:41:20
 */
@RestController
@RequestMapping("tCode")
public class TCodeController {
    /**
     * 服务对象
     */
    @Resource
    private TCodeService tCodeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TCode selectOne(Long id) {
        return this.tCodeService.queryById(id);
    }

}