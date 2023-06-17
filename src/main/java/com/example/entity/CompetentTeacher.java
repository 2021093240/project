package com.example.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.security.Timestamp;
/**
 * (CompetentTeacher)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:47:26
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CompetentTeacher implements Serializable {
    private static final long serialVersionUID = 405965285261671335L;
    
    private Integer id;
    
    private Integer competentId;
    
    private Integer teacherId;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
