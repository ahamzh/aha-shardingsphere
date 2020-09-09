package com.aha.shardingjdbc.module.user.service.impl;

import com.aha.shardingjdbc.module.user.entity.TUser;
import com.aha.shardingjdbc.module.user.dao.TUserDao;
import com.aha.shardingjdbc.module.user.service.TUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 跨库操作必须开启分布式事务，不然无法保证事务一致性
 * 用户表（根据用户id分表）(TUser)表服务实现类
 *
 * @author ahamzh
 * @since 2020-09-09 00:43:47
 */
@Service("tUserService")
@Transactional(rollbackFor = Exception.class)
@ShardingTransactionType(value = TransactionType.XA)
public class TUserServiceImpl extends ServiceImpl<TUserDao, TUser> implements TUserService {
    @Resource
    private TUserDao tUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TUser queryById(Long id) {
        return this.tUserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TUser> queryAllByLimit(int offset, int limit) {
        return this.tUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Override
    public TUser insert(TUser tUser) {
        this.tUserDao.insert(tUser);
        return tUser;
    }

    /**
     * 修改数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Override
    public TUser update(TUser tUser) {
        this.tUserDao.update(tUser);
        return this.queryById(tUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tUserDao.deleteById(id) > 0;
    }

    @Override
    public void insertUsers() throws Exception {
        for (int i = 0; i < 3; i++) {
            insert(TUser.builder().deptId(1L).userName("第" + i + "个用户").build());
        }
        throw new Exception("自定义异常");
    }
}