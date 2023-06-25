package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RefundHw3 {

    private Integer id;
    private Integer stuId;
    private String sdName;
    private Integer state;
    private Date refundTime;
    private Date agreeTime;

}
