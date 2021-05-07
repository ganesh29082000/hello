package com.klu.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.klu.Bean.RegistrationBean;
import com.klu.Connections.DBUtil;
public class DAO {
           public int registerUser(RegistrationBean rb) throws ClassNotFoundException ,SQLException{
             Connection con=DBUtil.DBConnection();
             String sql="insert into DancerRegistration(name,email,age,phone,username,password,dancestyle,choreographername) values(?,?,?,?,?,?,?,?)";
             PreparedStatement ps=con.prepareStatement(sql);
      
               ps.setString(1, rb.getName());
               ps.setString(2, rb.getEmail());
               ps.setInt(3, rb.getAge());
               ps.setLong(4,rb.getPno());
               ps.setString(5, rb.getUsername());
               ps.setString(6, rb.getPassword());
               ps.setString(7, "null");
               ps.setString(8,"null");
             
               
               int i=ps.executeUpdate();
               return i;//insert rows
           }
           public boolean loginUser(String username, String password) throws ClassNotFoundException, SQLException
           {
        	   Connection con=DBUtil.DBConnection();
        	   String sql="select * from DancerRegistration where username = ? and password = ?";
        	   PreparedStatement ps=con.prepareStatement(sql);
        	   ps.setString(1, username);
        	   ps.setString(2, password);
        	   ResultSet rs=ps.executeQuery();
        	   boolean res=rs.next();
        	   return res;
           }
           public int updateDancerRegistration(String name,String style,String username) throws SQLException, ClassNotFoundException
           {
        	   Connection con=DBUtil.DBConnection();
        	   PreparedStatement ps=con.prepareStatement("update DancerRegistration set dancestyle=?,choreographername=? where username=?");
        	   ps.setString(1, style);
        	   ps.setString(2, name);
        	   ps.setString(3, username);
        	   int i=ps.executeUpdate();
        	   System.out.println(style+" "+name+" "+username);
        	   return i;
           }
           
}