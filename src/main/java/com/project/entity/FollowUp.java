package com.project.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.security.Timestamp;

/**
 * (FollowUp)实体类
 *
 * @author makejava
 * @since 2023-06-15 21:15:59
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FollowUp implements Serializable {
    private static final long serialVersionUID = 332617934236672809L;
    
    private Integer id;
    
    private Integer paymentState;
    
    private Integer registrationTime;
    
    private Integer stuId;
    
    private Timestamp paymentTime;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
