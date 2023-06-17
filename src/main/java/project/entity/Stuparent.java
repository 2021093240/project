package project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (Stuparent)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:03:25
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Stuparent implements Serializable {
    private static final long serialVersionUID = -78984143059916558L;
    
    private Integer stuId;
    
    private String parentName;
    
    private String relation;
    
    private String phonenum;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
