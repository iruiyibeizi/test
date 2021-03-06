package com.atguigu.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @auther zhaolixin
 * @creat 2021.05.20.12:32
 */
public class jdbcUtils {
    private static DruidDataSource dataSource;
    static {
        Properties properties = new Properties();
        InputStream inputStream = jdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        Connection conn=null;
            try {
                conn=dataSource.getConnection();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return conn;
        }
       public  static void close(Connection conn){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
       }


}
