package project.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * (HistoryTable)实体类
 *
 * @author makejava
 * @since 2023-06-17 15:03:24
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class HistoryTable implements Serializable {
    private static final long serialVersionUID = -23986606863864791L;
    
    private Integer id;
    
    private Integer stuId;
    
    private Integer oldClassId;
    
    private Integer newClassId;
    
    private Integer state;
    
    private Timestamp changeTime;
    
    private Timestamp agreeTime;
    
    private String back01;
    
    private String back02;
    
    private String back03;
    
    private String back04;
    
    private String back05;
}
