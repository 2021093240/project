package com.example.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.security.Timestamp;
/**
 * (Refund)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:47:27
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Refund implements Serializable {
    private static final long serialVersionUID = 433104063739741427L;
    
    private Integer id;
    
    private Integer stuId;
    
    private Integer state;
    
    private Timestamp refundTime;
    
    private Timestamp agreeTime;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
