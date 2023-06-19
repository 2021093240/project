package com.example.mapper;

import com.example.entity.Account;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.Map;

/**
 * (Account)表数据库访问层
 *
 * @author makejava
 * @since 2023-06-17 15:44:57
 */
 
public interface AccountDao extends BaseMapper<Account>{

}
