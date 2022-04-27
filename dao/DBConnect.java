package Camel.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

    public static Connection getConnection() {
        final String url = "jdbc:sqlserver://JONNYDAM\\SQLEXPRESS:1433;databaseName =QLHV";
        final String userName = "sa";
        final String password = "12345";
        Connection cons = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cons = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cons;
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
    
}