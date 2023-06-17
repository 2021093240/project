package project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (CourseTeacherClass)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:03:24
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CourseTeacherClass implements Serializable {
    private static final long serialVersionUID = -48303192769168502L;
    
    private Integer id;
    
    private Integer teacherId;
    
    private Integer courseId;
    
    private Integer classId;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
