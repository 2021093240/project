package project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (Applydetail)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:03:23
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Applydetail implements Serializable {
    private static final long serialVersionUID = -99157390293674835L;
    
    private Object id;
    
    private Integer detail;
    
    private Timestamp studyovertime;
    
    private Integer studentId;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
