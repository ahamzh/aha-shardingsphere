package com.aha.shardingjdbc.module.deptment.dao;

import com.aha.shardingjdbc.module.deptment.entity.SysDeptment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 部门信息(SysDeptment0)表数据库访问层
 *
 * @author zhihao.mao
 * @since 2020-09-08 17:16:51
 */
public interface SysDeptmentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param deptId 主键
     * @return 实例对象
     */
    SysDeptment queryById(Integer deptId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysDeptment> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysDeptment0 实例对象
     * @return 对象列表
     */
    List<SysDeptment> queryAll(SysDeptment sysDeptment0);

    /**
     * 新增数据
     *
     * @param sysDeptment0 实例对象
     * @return 影响行数
     */
    int insert(SysDeptment sysDeptment0);

    /**
     * 修改数据
     *
     * @param sysDeptment0 实例对象
     * @return 影响行数
     */
    int update(SysDeptment sysDeptment0);

    /**
     * 通过主键删除数据
     *
     * @param deptId 主键
     * @return 影响行数
     */
    int deleteById(Integer deptId);

}