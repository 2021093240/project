package com.example.entity;


import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.security.Timestamp;
/**
 * (Studentdetails)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:47:27
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("studentdetails")
public class Studentdetails implements Serializable {
    private static final long serialVersionUID = -37071177888611004L;
    @TableId(type = IdType.AUTO)
    private Integer sdId;
    
    private String sdName;
    
    private Integer sdSex;
    
    private Integer sdAge;
    
    private String sdAddress;
    
    private String sdPhone;
    
    private String sdHeadimg;
    
    private Integer stuId;
    
    private String classId;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
