package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2023-06-20 11:40:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@TableName("student")
public class Student implements Serializable {
    private static final long serialVersionUID = 895108490730300900L;

    @TableId(type = IdType.AUTO)
    private Integer stuId;

    private Integer ctid;

    private Date date;

    private Integer courseId;

    private Integer accountId;

    private Integer tid;

    private Integer status;

    private String back04;

    private String back05;





}
