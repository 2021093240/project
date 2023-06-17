package project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (Payment)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:03:24
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private static final long serialVersionUID = -46710217477448065L;
    
    private Object id;
    
    private Integer paystatus;
    
    private Integer studentId;
    
    private Float paymenMoney;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
