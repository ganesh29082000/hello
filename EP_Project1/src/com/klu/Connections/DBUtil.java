package com.klu.Connections;
import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.SQLException;
public class DBUtil {
  final static String forNameURL="com.mysql.cj.jdbc.Driver";
  final static String dBURL="jdbc:mysql://localhost:3306/EP_Project1";
  final static String username="root";
  final static String password="ganesh123";
  public static Connection DBConnection() throws SQLException, ClassNotFoundException {
    Class.forName(forNameURL);
    Connection con=java.sql.DriverManager.getConnection(dBURL,username,password);
    return con;
    }
}