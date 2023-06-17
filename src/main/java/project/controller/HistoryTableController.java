package project.controller;

import project.entity.HistoryTable;
import project.service.HistoryTableService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (HistoryTable)表控制层
 *
 * @author makejava
 * @since 2023-06-17 15:03:24
 */
@RestController
@RequestMapping("historyTable")
public class HistoryTableController {
  
    @Resource
    private HistoryTableService historyTableService;

   
}

