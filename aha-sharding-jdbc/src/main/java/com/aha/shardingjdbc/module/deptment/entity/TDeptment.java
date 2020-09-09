package com.aha.shardingjdbc.module.deptment.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 部门表（用hint根据部门名称分表）(TDeptment)实体类
 *
 * @author makejava
 * @since 2020-09-09 00:04:17
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TDeptment implements Serializable {
    private static final long serialVersionUID = 745750056054502561L;
    /**
     * 主键（采用雪花算法）
     */
    private Long id;
    /**
     * 用户名
     */
    private String deptmentName;

    private String deptmentInfo;

    private Date createTime;

    private Date updateTime;

}