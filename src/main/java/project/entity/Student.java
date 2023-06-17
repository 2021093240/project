package project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:03:25
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    private static final long serialVersionUID = -56816984751857228L;
    
    private Integer stuId;
    
    private Integer courseId;
    
    private Timestamp createTime;
    
    private Integer accountId;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
