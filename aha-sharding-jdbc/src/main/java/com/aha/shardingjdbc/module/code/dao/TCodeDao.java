package com.aha.shardingjdbc.module.code.dao;

import com.aha.shardingjdbc.module.code.entity.TCode;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TCode)表数据库访问层
 *
 * @author zhihao.mao
 * @since 2020-09-09 15:41:17
 */
public interface TCodeDao extends BaseMapper<TCode> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TCode queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TCode> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tCode 实例对象
     * @return 对象列表
     */
    List<TCode> queryAll(TCode tCode);

    /**
     * 新增数据
     *
     * @param tCode 实例对象
     * @return 影响行数
     */
//    int insert(TCode tCode);

    /**
     * 修改数据
     *
     * @param tCode 实例对象
     * @return 影响行数
     */
    int update(TCode tCode);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}