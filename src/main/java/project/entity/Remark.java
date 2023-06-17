package project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (Remark)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:03:25
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Remark implements Serializable {
    private static final long serialVersionUID = -69660278259279422L;
    
    private Object id;
    
    private String remark;
    
    private Integer teacherId;
    
    private Integer studentId;
    
    private Timestamp remarkTime;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
