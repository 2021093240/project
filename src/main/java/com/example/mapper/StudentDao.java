package com.example.mapper;

import com.example.entity.Student;
import com.example.entity.StudentVO;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.Map;

/**
 * (Student)表数据库访问层
 *
 * @author makejava
 * @since 2023-06-17 17:29:48
 */
 
public interface StudentDao extends BaseMapper<Student>{

    List<StudentVO> selectStatus();

}
