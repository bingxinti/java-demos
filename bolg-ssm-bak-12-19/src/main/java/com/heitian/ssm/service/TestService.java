package com.heitian.ssm.service;

import com.heitian.ssm.dao.TestDao;
import com.heitian.ssm.model.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Demon on 16/12/19.
 */
public interface TestService {

    List<Test> getAllTest();

}
