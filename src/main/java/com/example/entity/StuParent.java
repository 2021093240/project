package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


@TableName("stuparent")
public class StuParent {

    @TableId(type = IdType.AUTO)
    private Integer id ;

    private Integer stuId ;
    private String parentName ;
    private String relation ;
    private String phonenum ;

}
