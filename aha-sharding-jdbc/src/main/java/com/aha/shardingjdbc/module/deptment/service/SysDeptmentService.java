package com.aha.shardingjdbc.module.deptment.service;

import com.aha.shardingjdbc.module.deptment.entity.SysDeptment;

import java.util.List;

/**
 * 部门信息(SysDeptment0)表服务接口
 *
 * @author zhihao.mao
 * @since 2020-09-08 17:16:52
 */
public interface SysDeptmentService {

    /**
     * 通过ID查询单条数据
     *
     * @param deptId 主键
     * @return 实例对象
     */
    SysDeptment queryById(Integer deptId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysDeptment> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysDeptment0 实例对象
     * @return 实例对象
     */
    SysDeptment insert(SysDeptment sysDeptment0);

    /**
     * 修改数据
     *
     * @param sysDeptment0 实例对象
     * @return 实例对象
     */
    SysDeptment update(SysDeptment sysDeptment0);

    /**
     * 通过主键删除数据
     *
     * @param deptId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer deptId);

}