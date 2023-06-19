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
/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:47:27
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("student")
public class Student implements Serializable {
    private static final long serialVersionUID = 130289937152141459L;

    @TableId(type = IdType.AUTO)
    private Integer stuId;
    
    private Integer courseId;
    
    private Timestamp createTime;
    
    private Integer accountId;
    
    private Integer status;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
