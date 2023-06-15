package com.project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (Course)实体类
 *
 * @author makejava
 * @since 2023-06-15 21:15:59
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Course implements Serializable {
    private static final long serialVersionUID = 914175133035734638L;
    
    private Integer id;
    
    private String name;
    
    private Integer teaId;
    
    private Double money;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
