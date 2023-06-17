package project.service.impl;

import project.entity.Remark;
import project.dao.RemarkDao;
import project.service.RemarkService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Remark)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 15:03:25
 */
@Service
public class RemarkServiceImpl implements RemarkService {
     @Resource
    private RemarkDao remarkDao;

   
}
