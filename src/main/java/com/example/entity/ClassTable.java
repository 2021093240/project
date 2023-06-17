package com.example.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.security.Timestamp;
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
public class ClassTable implements Serializable {
    private static final long serialVersionUID = -83614497109461936L;
    
    private Integer classId;
    
    private String className;
    
    private Timestamp createTime;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
