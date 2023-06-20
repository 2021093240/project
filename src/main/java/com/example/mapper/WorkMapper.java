package com.example.mapper;

import com.example.entity.Work;
import com.example.entity.WorkVO;

import java.util.List;

public interface WorkMapper {


    int addWork(Work work);

    List<Work> queryWork();

    int updateByIdWord(Work work);

    int updateByIdWord2(Work work);

    List<WorkVO> findByWorkAll();

}

