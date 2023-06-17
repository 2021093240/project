package project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (CompetentTeacher)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:03:23
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CompetentTeacher implements Serializable {
    private static final long serialVersionUID = 149319505315956350L;
    
    private Integer id;
    
    private Integer competentId;
    
    private Integer teacherId;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
