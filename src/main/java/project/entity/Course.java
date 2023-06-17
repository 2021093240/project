package project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (Course)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:03:23
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Course implements Serializable {
    private static final long serialVersionUID = -21061727972907368L;
    
    private Integer courseId;
    
    private String courseName;
    
    private Float courseMoney;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
