package com.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
/**
 * (Account)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:44:57
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Account implements Serializable {
    private static final long serialVersionUID = 739424062845103940L;
    
    private Integer id;
    
    private String username;
    
    private String password;
    
    private Integer powerId;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
