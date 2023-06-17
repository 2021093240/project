package com.example.entity;


import java.io.Serializable;
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
public class Studentdetails implements Serializable {
    private static final long serialVersionUID = -37071177888611004L;
    
    private Integer sdId;
    
    private String sdName;
    
    private Integer sdSex;
    
    private Integer sdAge;
    
    private String sdAddress;
    
    private String sdPhone;
    
    private String sdHeadimg;
    
    private Integer stuId;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
