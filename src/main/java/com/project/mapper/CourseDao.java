package com.project.dao;

import com.project.entity.Course;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.Map;

/**
 * (Course)表数据库访问层
 *
 * @author makejava
 * @since 2023-06-15 21:20:41
 */
 
public interface CourseDao extends BaseMapper<Course>{

}
