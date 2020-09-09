package com.aha.shardingjdbc.module.code.service.impl;

import com.aha.shardingjdbc.module.code.dao.TCodeDao;
import com.aha.shardingjdbc.module.code.entity.TCode;
import com.aha.shardingjdbc.module.code.service.TCodeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TCode)表服务实现类
 *
 * @author zhihao.mao
 * @since 2020-09-09 15:41:19
 */
@Service("tCodeService")
public class TCodeServiceImpl implements TCodeService {
    @Resource
    private TCodeDao tCodeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TCode queryById(Long id) {
        return this.tCodeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TCode> queryAllByLimit(int offset, int limit) {
        return this.tCodeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tCode 实例对象
     * @return 实例对象
     */
    @Override
    public TCode insert(TCode tCode) {
        this.tCodeDao.insert(tCode);
        return tCode;
    }

    /**
     * 修改数据
     *
     * @param tCode 实例对象
     * @return 实例对象
     */
    @Override
    public TCode update(TCode tCode) {
        this.tCodeDao.update(tCode);
        return this.queryById(tCode.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tCodeDao.deleteById(id) > 0;
    }
}