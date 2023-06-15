package com.project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (UserPower)实体类
 *
 * @author makejava
 * @since 2023-06-15 21:16:00
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserPower implements Serializable {
    private static final long serialVersionUID = 612348776017287430L;
    
    private Integer powerId;
    
    private Integer power;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
