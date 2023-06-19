package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.HistoryTable2;

import java.util.List;

public interface ClassManagement extends BaseMapper {
    List<HistoryTable2> getClassAll();
}
