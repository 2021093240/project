package com.project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (StuDetails)实体类
 *
 * @author makejava
 * @since 2023-06-15 21:15:59
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StuDetails implements Serializable {
    private static final long serialVersionUID = 409334288404581113L;
    
    private Integer id;
    
    private Integer uid;
    
    private Integer sex;
    
    private Integer age;
    
    private String province;
    
    private String city;
    
    private String district;
    
    private String address;
    
    private Long tel;
    
    private Integer courseId;
    
    private Timestamp commitTime;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
