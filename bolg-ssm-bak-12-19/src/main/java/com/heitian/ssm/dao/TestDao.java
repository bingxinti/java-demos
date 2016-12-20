package com.heitian.ssm.dao;

import com.heitian.ssm.model.Test;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TestDao {
    List<Test> selectAllTest();
}
