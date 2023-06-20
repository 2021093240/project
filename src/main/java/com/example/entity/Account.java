package com.example.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * (Account)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:44:57
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("account")
public class Account extends BaseAccount implements Serializable{
    private static final long serialVersionUID = 739424062845103940L;
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String salt ;
    private Integer powerId;
}





