package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistoryTableHw2 {
    private Integer id;
    private Integer stid;
    private String stname;
    private String yclsname;
    private String zrclsname;
    private String proname;
    private String sqtime;
    private Integer state;
    private String sptime;
}
