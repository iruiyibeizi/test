package com.atguigu.test;

import com.alibaba.druid.util.JdbcUtils;
import com.atguigu.utils.jdbcUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @auther zhaolixin
 * @creat 2021.05.20.13:10
 */
public class jdbcUtilsTest {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn=null;
        try {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/book","root","123456");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(conn);

    }
}
