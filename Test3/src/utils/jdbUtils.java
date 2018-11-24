package utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;


public class jdbUtils {

    private static DataSource datasource = null;
    static {
        DataSource datasource = new ComboPooledDataSource();

        ((ComboPooledDataSource) datasource).setUser("root");
        ((ComboPooledDataSource) datasource).setPassword("root");
        ((ComboPooledDataSource) datasource).setJdbcUrl("127.0.0.1");

    }



    public jdbUtils(){}


    public Connection getConnection() {

        try{
            Connection  connect  = datasource.getConnection();
            return  connect;
        }catch (  java.sql.SQLException e ){
            System.out.println(e);
            System.out.println("连接出现异常");
        }
//        会不会出现空指针 /？
        finally {
            System.out.println("hello world  ======  ===== === ====");
        }
        return null;
    }




}
