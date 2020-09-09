package com.aha.shardingjdbc.module.user.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表（根据用户id分表）(TUser)实体类
 *
 * @author makejava
 * @since 2020-09-09 00:43:45
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TUser implements Serializable {
    private static final long serialVersionUID = 641683422169611175L;
    /**
     * 主键（采用雪花算法）
     */
    private Long id;
    /**
     * 用户名
     */
    private String userName;

    private Integer userAge;

    private String userInfo;

    private Date createTime;

    private Date updateTime;

}