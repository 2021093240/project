package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String name;//老师姓名
    private String contactWay;//联系电话
    private String password;//密码
    private String education;//学历
    private Integer power;//角色
    private List<Integer> nav;//权限的数组
}
