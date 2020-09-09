package com.aha.shardingjdbc.module.code.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (TCode)实体类
 *
 * @author zhihao.mao
 * @since 2020-09-09 15:41:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("t_code")
public class TCode implements Serializable {
    private static final long serialVersionUID = -12978952847963463L;
    /**
     * 主键
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    private String codeName;

    private String codeValue;

}