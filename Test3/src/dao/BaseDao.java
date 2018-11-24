package dao;


import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import utils.jdbUtils;

 class BaseDao{
//    返回一个object_list
    public  String seletSql = "";
    public String updateSql = "";
//    public Connection connet =  new jdbUtils().getConnection();
    QueryRunner queryRunner =  new QueryRunner();

   public  <T>  List<T>   executeSelect(  String seletSql  ){
       Statement state = null;
       Connection connet =  new jdbUtils().getConnection();

       try {
           queryRunner.query(connet,seletSql,new BeanHandler<T>(null));

       }catch (Exception e ){
           System.out.println(e);
          System.out.println( e.getMessage());
       }

       if(state != null){
           try{
           boolean t =   state.execute(seletSql);
           }catch ( Exception e ){

               System.out.println(e);

           }
       }

       return null;

   }

}
