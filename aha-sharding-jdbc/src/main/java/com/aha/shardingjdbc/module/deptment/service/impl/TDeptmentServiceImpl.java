package com.aha.shardingjdbc.module.deptment.service.impl;

import com.aha.shardingjdbc.module.deptment.entity.TDeptment;
import com.aha.shardingjdbc.module.deptment.dao.TDeptmentDao;
import com.aha.shardingjdbc.module.deptment.service.TDeptmentService;
import org.apache.shardingsphere.api.hint.HintManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 部门表（用hint根据部门名称分表）(TDeptment0)表服务实现类
 *
 * @author makejava
 * @since 2020-09-09 00:04:19
 */
@Service("tDeptment0Service")
public class TDeptmentServiceImpl implements TDeptmentService {
    @Resource
    private TDeptmentDao tDeptmentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TDeptment queryById(Long id) {
        try (HintManager hintManager = HintManager.getInstance();) {
            hintManager.addDatabaseShardingValue("t_deptment", "first");
            hintManager.addTableShardingValue("t_deptment", "first");
            return this.tDeptmentDao.queryById(id);
        }
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TDeptment> queryAllByLimit(int offset, int limit) {
        return this.tDeptmentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tDeptment 实例对象
     * @return 实例对象
     */
    @Override
    public TDeptment insert(TDeptment tDeptment) {
        this.tDeptmentDao.insert(tDeptment);
        return tDeptment;
    }

    /**
     * 修改数据
     *
     * @param tDeptment 实例对象
     * @return 实例对象
     */
    @Override
    public TDeptment update(TDeptment tDeptment) {
        this.tDeptmentDao.update(tDeptment);
        return this.queryById(tDeptment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tDeptmentDao.deleteById(id) > 0;
    }
}