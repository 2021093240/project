package project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (Account)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:03:23
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Account implements Serializable {
    private static final long serialVersionUID = -46010472257419916L;
    
    private Integer id;
    
    private String username;
    
    private String password;
    
    private Integer powerId;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
