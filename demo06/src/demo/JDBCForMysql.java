package demo;

import java.sql.*;

/**
 * Created by Demon on 16/12/12.
 */
public class JDBCForMysql
{

    //jdbc 驱动名和数据库url
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/blog";

    //数据库的用户名与密码
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            //注册jdbc驱动
            Class.forName(JDBC_DRIVER);

            //打开连接
            System.out.println("=====打开数据库连接====");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //执行查询
            System.out.println("=====实例化Statement====");
            stmt = conn.createStatement();
            String sql = "select * from news  limit 3";

            ResultSet rs = stmt.executeQuery(sql);

            //得到结果
            while(rs.next()){
                System.out.println("id："+rs.getInt("id")
                        +"\ntitle："+rs.getString("title")
                        +"\ncontent："+rs.getString("content"));
                System.out.println("\n");

            }

            //完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(stmt!=null){
                    stmt.close();
                }

                if(conn!=null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

//		System.out.print(URLDecoder.decode(URLDecoder.decode("%25E4%25B8%25AD%25E6%2596%2587")));
    }

}
