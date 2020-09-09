package com.aha.shardingjdbc.module.code.service;

import com.aha.shardingjdbc.module.code.entity.TCode;

import java.util.List;

/**
 * (TCode)表服务接口
 *
 * @author zhihao.mao
 * @since 2020-09-09 15:41:18
 */
public interface TCodeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TCode queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TCode> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tCode 实例对象
     * @return 实例对象
     */
    TCode insert(TCode tCode);

    /**
     * 修改数据
     *
     * @param tCode 实例对象
     * @return 实例对象
     */
    TCode update(TCode tCode);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}