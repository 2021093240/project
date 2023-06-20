package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class StuParent {

    private Integer id ;
    private String parentName ;
    private String relation ;
    private String phonenum ;

}
