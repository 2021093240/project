package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 表示存储分页信息数据的一个实体类
 * 1，分页的大小
 * 2.页号：第几页的数据
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Page_hhy implements Serializable {
    private Integer page=1;
    private Integer size=10;
}
