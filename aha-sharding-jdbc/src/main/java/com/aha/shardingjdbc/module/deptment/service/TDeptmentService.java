package com.aha.shardingjdbc.module.deptment.service;

import com.aha.shardingjdbc.module.deptment.entity.TDeptment;
import java.util.List;

/**
 * 部门表（用hint根据部门名称分表）(TDeptment0)表服务接口
 *
 * @author makejava
 * @since 2020-09-09 00:04:19
 */
public interface TDeptmentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TDeptment queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TDeptment> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tDeptment 实例对象
     * @return 实例对象
     */
    TDeptment insert(TDeptment tDeptment);

    /**
     * 修改数据
     *
     * @param tDeptment 实例对象
     * @return 实例对象
     */
    TDeptment update(TDeptment tDeptment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}