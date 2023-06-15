package com.project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (UpdateClazzHistory)实体类
 *
 * @author makejava
 * @since 2023-06-15 21:16:00
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UpdateClazzHistory implements Serializable {
    private static final long serialVersionUID = 969030132870316020L;
    
    private Integer id;
    
    private Integer stuId;
    
    private Integer clazzIdOld;
    
    private Integer clazzIdNew;
    
    private Integer status;
    
    private Timestamp updateTime;
    
    private Timestamp commitUpdate;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
