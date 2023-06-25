package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * (CompetentTeacher)实体类
 *
 * @author makejava
 * @since 2023-06-20 15:17:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("competent_teacher")
public class CompetentTeacher implements Serializable {
    private static final long serialVersionUID = -11593217427114946L;
    @TableId(type = IdType.AUTO)
    private Integer ctid;
    
    private String name;
    
    private Integer accountId;
    


}

