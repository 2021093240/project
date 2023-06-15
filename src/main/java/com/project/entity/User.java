package com.project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2023-06-15 21:16:00
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 785757166105884587L;
    
    private Integer id;
    
    private String name;
    
    private String pwd;
    
    private Integer powerId;
}
