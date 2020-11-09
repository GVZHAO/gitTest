package com.qf.test;

import com.qf.dao.StudentDao;
import com.qf.dao.impl.StudentDaoImpl;
import org.junit.jupiter.api.Test;


public class TestStudent {

    private StudentDao studentDao = new StudentDaoImpl();

    @Test
    public void test1(){
        studentDao.selectAll();
    }
}
