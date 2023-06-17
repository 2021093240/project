package project.service.impl;

import project.entity.HistoryTable;
import project.dao.HistoryTableDao;
import project.service.HistoryTableService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (HistoryTable)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 15:03:24
 */
@Service
public class HistoryTableServiceImpl implements HistoryTableService {
     @Resource
    private HistoryTableDao historyTableDao;

   
}
