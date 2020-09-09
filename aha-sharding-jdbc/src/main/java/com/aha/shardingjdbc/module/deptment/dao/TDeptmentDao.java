package com.aha.shardingjdbc.module.deptment.dao;

import com.aha.shardingjdbc.module.deptment.entity.TDeptment;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 部门表（用hint根据部门名称分表）(TDeptment)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-09 00:04:18
 */
public interface TDeptmentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TDeptment queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TDeptment> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tDeptment 实例对象
     * @return 对象列表
     */
    List<TDeptment> queryAll(TDeptment tDeptment);

    /**
     * 新增数据
     *
     * @param tDeptment 实例对象
     * @return 影响行数
     */
    int insert(TDeptment tDeptment);

    /**
     * 修改数据
     *
     * @param tDeptment 实例对象
     * @return 影响行数
     */
    int update(TDeptment tDeptment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}