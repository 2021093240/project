package project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (Power)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:03:24
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Power implements Serializable {
    private static final long serialVersionUID = -83413143244071623L;
    
    private Integer id;
    
    private String power;
}
