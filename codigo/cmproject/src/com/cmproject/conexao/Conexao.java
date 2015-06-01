package com.cmproject.conexao;

/**
 * Created by tarcisio on 01/06/15.
 */

import java.sql.DriverManager;
        import java.sql.Statement;
        import java.sql.ResultSet;
        import java.sql.Connection;
        import javax.naming.InitialContext;
        import  javax.sql.DataSource;

public class Conexao {

    public static Connection getConnection() throws Exception{
        try{

            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/cmproject", "root", "1234");
        }

        catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public static void closeConnection(Connection conn, Statement stmt, ResultSet rs)throws Exception{
        close(conn,stmt,rs);
    }

    public static void closeConnection(Connection conn, Statement stmt)throws Exception{
        close(conn,stmt,null);
    }

    public static void closeConnection(Connection conn)throws Exception{
        close(conn,null,null);
    }

    private static void close(Connection conn, Statement stmt, ResultSet rs) throws Exception{
        try{
            if(rs!=null) rs.close();
            if(stmt!=null)stmt.close();
            if(conn!=null)conn.close();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
}