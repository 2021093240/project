package com.project.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.security.Timestamp;

/**
 * (Clazz)实体类
 *
 * @author makejava
 * @since 2023-06-15 21:15:59
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Clazz implements Serializable {
    private static final long serialVersionUID = 942664878674219056L;
    
    private Integer id;
    
    private Integer teaId;
    
    private String name;
    
    private Timestamp createTime;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
