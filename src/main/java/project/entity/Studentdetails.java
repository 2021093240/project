package project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (Studentdetails)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:03:25
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Studentdetails implements Serializable {
    private static final long serialVersionUID = 368167919867021984L;
    
    private Integer sdId;
    
    private String sdName;
    
    private Integer sdSex;
    
    private Integer sdAge;
    
    private String sdAddress;
    
    private String sdPhone;
    
    private String sdHeadimg;
    
    private Integer stuId;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
