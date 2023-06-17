package com.example.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.security.Timestamp;
/**
 * (Remark)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:47:27
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Remark implements Serializable {
    private static final long serialVersionUID = -60170095440719188L;
    
    private Object id;
    
    private String remark;
    
    private Integer teacherId;
    
    private Integer studentId;
    
    private Timestamp remarkTime;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
