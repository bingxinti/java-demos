package com.heitian.ssm.service.impl;

import com.heitian.ssm.dao.TestDao;
import com.heitian.ssm.model.Test;
import com.heitian.ssm.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Demon on 16/12/19.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TestServiceImpl  implements TestService{

    @Resource
    private TestDao testDao;

    public List<Test> getAllTest(){
        return testDao.selectAllTest();

    }

}
