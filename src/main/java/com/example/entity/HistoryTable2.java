package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistoryTable2 {
    private Integer id;
    private String stname;
    private String clname;
    private String addclname;
    private Integer state;
    private String ppname;
    private Date sqtime;
    private Date sptime;
}
