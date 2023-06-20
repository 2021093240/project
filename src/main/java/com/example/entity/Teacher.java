package com.example.entity;


import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.security.Timestamp;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * (Teacher)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:47:27
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("teacher")
public class Teacher implements Serializable {
    private static final long serialVersionUID = -19903459299411420L;

    @TableId(type = IdType.AUTO)
    private Integer teacherId;

    private String teacherName;
    
    private Integer accountId;

    private String education;

    private String contactWay;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date entryTime;

    private int ctid;
}
