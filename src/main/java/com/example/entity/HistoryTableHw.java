package com.example.entity;


import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * (HistoryTable)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:47:27
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("history_table")
public class HistoryTableHw implements Serializable {
    private static final long serialVersionUID = 467554315687235856L;

    @TableId(type = IdType.AUTO)
    private Integer id;
    
    private Integer stuId;
    
    private Integer oldClassId;
    
    private Integer newClassId;
    
    private Integer state;
    
    private Date applyforTime;
    
    private Date agreeTime;
    
    private Integer proposer;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
