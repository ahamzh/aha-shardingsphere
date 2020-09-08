package com.aha.shardingjdbc.module.deptment.service.impl;

import com.aha.shardingjdbc.module.deptment.dao.SysDeptmentDao;
import com.aha.shardingjdbc.module.deptment.entity.SysDeptment;
import com.aha.shardingjdbc.module.deptment.service.SysDeptmentService;
import org.apache.shardingsphere.api.hint.HintManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 部门信息(SysDeptment0)表服务实现类
 *
 * @author zhihao.mao
 * @since 2020-09-08 17:16:53
 */
@Service("sysDeptment0Service")
public class SysDeptmentServiceImpl implements SysDeptmentService {
    @Resource
    private SysDeptmentDao sysDeptmentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param deptId 主键
     * @return 实例对象
     */
    @Override
    public SysDeptment queryById(Integer deptId) {
        try (HintManager hintManager = HintManager.getInstance();) {
            hintManager.addDatabaseShardingValue("sys_deptment", 0);
            hintManager.addTableShardingValue("sys_deptment", 0);
            return this.sysDeptmentDao.queryById(deptId);
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
    public List<SysDeptment> queryAllByLimit(int offset, int limit) {

        List<SysDeptment> sysDeptmentList = this.sysDeptmentDao.queryAllByLimit(offset, limit);
        return sysDeptmentList;
    }

    /**
     * 新增数据
     *
     * @param sysDeptment0 实例对象
     * @return 实例对象
     */
    @Override
    public SysDeptment insert(SysDeptment sysDeptment0) {
        this.sysDeptmentDao.insert(sysDeptment0);
        return sysDeptment0;
    }

    /**
     * 修改数据
     *
     * @param sysDeptment0 实例对象
     * @return 实例对象
     */
    @Override
    public SysDeptment update(SysDeptment sysDeptment0) {
        this.sysDeptmentDao.update(sysDeptment0);
        return this.queryById(sysDeptment0.getDeptId());
    }

    /**
     * 通过主键删除数据
     *
     * @param deptId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer deptId) {
        return this.sysDeptmentDao.deleteById(deptId) > 0;
    }
}