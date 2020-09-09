package com.aha.shardingjdbc.module.deptment.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 部门表（用hint根据部门名称分表）(TDeptment)实体类
 *
 * @author ahamzh
 * @since 2020-09-09 00:04:17
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("t_deptment")
public class TDeptment implements Serializable {
    private static final long serialVersionUID = 745750056054502561L;
    /**
     * 主键（采用雪花算法）
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    /**
     * 用户名
     */
    private String deptmentName;

    private String deptmentInfo;

    private Date createTime;

    private Date updateTime;

    /**
     * 行政区划（用于分库）
     */
    private String areaCode;

}