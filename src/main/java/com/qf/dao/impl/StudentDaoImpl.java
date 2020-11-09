package com.qf.dao.impl;

import com.qf.dao.StudentDao;
import com.qf.pojo.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> selectAll() {

        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaee2007", "root", "123456");
            statement = conn.createStatement();
            String sql = "select * from users where 1 = 1";

            resultSet = statement.executeQuery(sql);

            List<Student> userList = new ArrayList<>();
            while (resultSet.next()) {
                Integer uid = resultSet.getInt("u_id");
                String uname = resultSet.getString("u_name");
                String upassword = resultSet.getString("u_password");
                Integer ublance = resultSet.getInt("u_blance");
                String utel = resultSet.getString("u_tel");

                Student student = new Student();
                student.setUid(uid);
                student.setUname(uname);
                student.setUpassword(upassword);
                student.setUblance(ublance);
                student.setUtel(utel);
                userList.add(student);
            }
            return userList;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

}
