package com.example.entity;


import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.security.Timestamp;
import java.util.Date;

/**
 * (ClassTable)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:47:26
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("class_table")
public class ClassTable implements Serializable {
    private static final long serialVersionUID = -83614497109461936L;

    @TableId(type = IdType.AUTO)
    private Integer classId;
    
    private String className;
    
    private Date createTime;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
