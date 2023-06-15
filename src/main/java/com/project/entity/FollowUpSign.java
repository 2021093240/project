package com.project.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.security.Timestamp;
/**
 * (FollowUpSign)实体类
 *
 * @author makejava
 * @since 2023-06-15 21:15:59
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FollowUpSign implements Serializable {
    private static final long serialVersionUID = 119515619563322633L;
    
    private Integer id;
    
    private String text;
    
    private Integer followUpId;
    
    private Timestamp time;
    
    private Integer teaId;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
