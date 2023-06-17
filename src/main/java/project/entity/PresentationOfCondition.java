package project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (PresentationOfCondition)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:03:24
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PresentationOfCondition implements Serializable {
    private static final long serialVersionUID = 464277403439960864L;
    
    private Integer id;
    
    private Integer teaId;
    
    private Integer stuId;
    
    private String classifier;
    
    private String text;
    
    private Timestamp time;
    
    private Integer state;
    
    private String back01;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
