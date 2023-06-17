package project.service.impl;

import project.entity.PresentationOfCondition;
import project.dao.PresentationOfConditionDao;
import project.service.PresentationOfConditionService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (PresentationOfCondition)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 15:03:24
 */
@Service
public class PresentationOfConditionServiceImpl implements PresentationOfConditionService {
     @Resource
    private PresentationOfConditionDao presentationOfConditionDao;

   
}
