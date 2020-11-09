package com.qf.service.impl;

import com.qf.dao.StudentDao;
import com.qf.dao.impl.StudentDaoImpl;
import com.qf.pojo.Student;
import com.qf.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> selectAll() {

        StudentDao studentDao = new StudentDaoImpl();
        return studentDao.selectAll();
    }
}
