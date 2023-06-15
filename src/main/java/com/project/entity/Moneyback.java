package com.project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (Moneyback)实体类
 *
 * @author makejava
 * @since 2023-06-15 21:15:59
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Moneyback implements Serializable {
    private static final long serialVersionUID = 104221508779877131L;
    
    private Integer moneybackId;
    
    private Integer studentId;
    
    private Timestamp moneybackTime;
    
    private String moneybackState;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
