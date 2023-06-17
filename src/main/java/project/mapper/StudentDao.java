package project.dao;

import project.entity.Student;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.Map;

/**
 * (Student)表数据库访问层
 *
 * @author makejava
 * @since 2023-06-17 15:03:25
 */
 
public interface StudentDao extends BaseMapper<Student>{

}
