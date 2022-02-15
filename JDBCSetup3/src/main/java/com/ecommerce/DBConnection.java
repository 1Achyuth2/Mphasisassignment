package com.ecommerce;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

        private Connection connection;
        private static final String dbURL="jdbc:mysql://localhost:3306/ecommerce";
        private static final String user="root";
        private static final String pwd="";
        public DBConnection(String dbURL, String user, String pwd) throws ClassNotFoundException, SQLException{
                
                Class.forName("com.mysql.jdbc.Driver");
                this.connection = DriverManager.getConnection(dbURL, user, pwd);
        }
        
        public Connection getConnection(){
                return this.connection;
        }
        
        public void closeConnection() throws SQLException {
                if (this.connection != null)
                        this.connection.close();
        }
}
