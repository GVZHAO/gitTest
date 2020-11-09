package com.qf.controller;

import com.qf.pojo.Student;
import com.qf.service.StudentService;
import com.qf.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/StudentSelectAll")
public class StudentServlet extends HttpServlet {

    //这是第二次测试
    private StudentService studentService = new StudentServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Student> list = studentService.selectAll();
        req.setAttribute("u",list);
        req.getRequestDispatcher("/studentList.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
