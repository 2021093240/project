package project.service.impl;

import project.entity.Stuparent;
import project.dao.StuparentDao;
import project.service.StuparentService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Stuparent)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 15:03:25
 */
@Service
public class StuparentServiceImpl implements StuparentService {
     @Resource
    private StuparentDao stuparentDao;

   
}
