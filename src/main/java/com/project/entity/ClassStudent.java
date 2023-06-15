package com.project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (ClassStudent)实体类
 *
 * @author makejava
 * @since 2023-06-15 21:15:59
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ClassStudent implements Serializable {
    private static final long serialVersionUID = 106755882383036756L;
    
    private Integer classStudentId;
    
    private Integer classId;
    
    private Integer studentId;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
