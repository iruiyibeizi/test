package com.atguigu.dao;

import com.atguigu.utils.jdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @auther zhaolixin
 * @creat 2021.05.20.14:19
 */
public abstract class BasoDao {
   private QueryRunner queryRunner=new QueryRunner();


   public int update(String sql, Object... arg){
       Connection connection = jdbcUtils.getConnection();
       try {
            return queryRunner.update(connection,sql,arg);
       } catch (SQLException throwables) {
           throwables.printStackTrace();
       }finally {
           jdbcUtils.close(connection);
       }
    return -1;
   }
   public<T> T queryForone(Class<T> type,String sql,Object...args){
       Connection conn=jdbcUtils.getConnection();


       try {
           return queryRunner.query(conn,sql,new BeanHandler<T>(type),args);
       } catch (SQLException throwables) {
           throwables.printStackTrace();
       }finally {
           jdbcUtils.close(conn);
       }
       return null;
   }
   public<T> List<T>  querForList(Class<T> type, String sql, Object...args){
       Connection conn=jdbcUtils.getConnection();
       try {
           return queryRunner.query(conn,sql,new BeanListHandler<T>(type),args);
       } catch (SQLException throwables) {
           throwables.printStackTrace();
       }finally{
           jdbcUtils.close(conn);
       }
       return null;

   }
   public Object querSingleValue(String sql,Object...args) {
       Connection conn = jdbcUtils.getConnection();
       try {
           queryRunner.query(conn,sql,new ScalarHandler(),args);
       } catch (SQLException throwables) {
           throwables.printStackTrace();
       }finally {
           jdbcUtils.close(conn);
       }
       return null;


   }

}
