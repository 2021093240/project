package com.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.security.Timestamp;
/**
 * (Applydetail)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:47:26
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Applydetail implements Serializable {
    private static final long serialVersionUID = -25327280261228978L;
    
        private     Integer id;
    
    private Integer detail;
    
    private Timestamp studyovertime;
    
    private Integer studentId;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
