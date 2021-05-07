package com.klu.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.klu.Bean.RegistrationBean;
import com.klu.Connections.DBUtil;

public class DAO2 {

	public int registerUser(RegistrationBean rb) throws ClassNotFoundException ,SQLException{
        Connection con=DBUtil.DBConnection();
        String sql="insert into MasterRegistration (name,email,age,phone,username,password,dance) values(?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
          
          ps.setString(1, rb.getName());
          ps.setString(2, rb.getEmail());
          ps.setInt(3, rb.getAge());
          ps.setLong(4,rb.getPno());
          ps.setString(5, rb.getUsername());
          ps.setString(6, rb.getPassword());
          ps.setString(7,rb.getDance());
          int i=ps.executeUpdate();
          return i;//insert rows
      }
      public boolean loginUser(String username, String password) throws ClassNotFoundException, SQLException
      {
   	   Connection con=DBUtil.DBConnection();
   	   String sql="select * from MasterRegistration where username = ? and password = ?";
   	   PreparedStatement ps=con.prepareStatement(sql);
   	   ps.setString(1, username);
   	   ps.setString(2, password);
   	   ResultSet rs=ps.executeQuery();
   	   boolean res=rs.next();
   	   return res;
      }
      public ResultSet getdancers(String cdance) throws ClassNotFoundException, SQLException
      {
    	  Connection con=DBUtil.DBConnection();
    	  PreparedStatement ps=con.prepareStatement("select * from DancerRegistration where dance=?");
    	  ps.setString(1, cdance);
    	  ResultSet rst=ps.executeQuery();
    	  return rst;
      }
      public ResultSet getbharatanatyamchoreographers() throws ClassNotFoundException, SQLException
      {
    	  Connection con=DBUtil.DBConnection();
    	  PreparedStatement ps=con.prepareStatement("select * from MasterRegistration where dance='bharatanatyam'");
    	  ResultSet rst=ps.executeQuery();
    	  return rst;
      }
      public ResultSet getkathakalichoreographers() throws ClassNotFoundException, SQLException
      {
    	  Connection con=DBUtil.DBConnection();
    	  PreparedStatement ps=con.prepareStatement("select * from MasterRegistration where dance='kathakali'");
    	  ResultSet rst=ps.executeQuery();
    	  return rst;
      }
      public ResultSet getkathakchoreographers() throws ClassNotFoundException, SQLException
      {
    	  Connection con=DBUtil.DBConnection();
    	  PreparedStatement ps=con.prepareStatement("select * from MasterRegistration where dance='kathak'");
    	  ResultSet rst=ps.executeQuery();
    	  return rst;
      }
      public ResultSet getmanipurichoreographers() throws ClassNotFoundException, SQLException
      {
    	  Connection con=DBUtil.DBConnection();
    	  PreparedStatement ps=con.prepareStatement("select * from MasterRegistration where dance='manipuri'");
    	  ResultSet rst=ps.executeQuery();
    	  return rst;
      }
      public ResultSet getkuchipudichoreographers() throws ClassNotFoundException, SQLException
      {
    	  Connection con=DBUtil.DBConnection();
    	  PreparedStatement ps=con.prepareStatement("select * from MasterRegistration where dance='kuchipudi'");
    	  ResultSet rst=ps.executeQuery();
    	  return rst;
      }
      public ResultSet getodissichoreographers() throws ClassNotFoundException, SQLException
      {
    	  Connection con=DBUtil.DBConnection();
    	  PreparedStatement ps=con.prepareStatement("select * from MasterRegistration where dance='odissi'");
    	  ResultSet rst=ps.executeQuery();
    	  return rst;
      }
      public ResultSet getfolkchoreographers() throws ClassNotFoundException, SQLException
      {
    	  Connection con=DBUtil.DBConnection();
    	  PreparedStatement ps=con.prepareStatement("select * from MasterRegistration where dance='folk'");
    	  ResultSet rst=ps.executeQuery();
    	  return rst;
      }
      public ResultSet gethiphopchoreographers() throws ClassNotFoundException, SQLException
      {
    	  Connection con=DBUtil.DBConnection();
    	  PreparedStatement ps=con.prepareStatement("select * from MasterRegistration where dance='hiphop'");
    	  ResultSet rst=ps.executeQuery();
    	  return rst;
      }
      public ResultSet getbreakchoreographers() throws ClassNotFoundException, SQLException
      {
    	  Connection con=DBUtil.DBConnection();
    	  PreparedStatement ps=con.prepareStatement("select * from MasterRegistration where dance='break'");
    	  ResultSet rst=ps.executeQuery();
    	  return rst;
      }
      public ResultSet getballetchoreographers() throws ClassNotFoundException, SQLException
      {
    	  Connection con=DBUtil.DBConnection();
    	  PreparedStatement ps=con.prepareStatement("select * from MasterRegistration where dance='ballet'");
    	  ResultSet rst=ps.executeQuery();
    	  return rst;
      }
      public ResultSet getsalsachoreographers() throws ClassNotFoundException, SQLException
      {
    	  Connection con=DBUtil.DBConnection();
    	  PreparedStatement ps=con.prepareStatement("select * from MasterRegistration where dance='salsa'");
    	  ResultSet rst=ps.executeQuery();
    	  return rst;
      }
      public ResultSet gettapchoreographers() throws ClassNotFoundException, SQLException
      {
    	  Connection con=DBUtil.DBConnection();
    	  PreparedStatement ps=con.prepareStatement("select * from MasterRegistration where dance='tap'");
    	  ResultSet rst=ps.executeQuery();
    	  return rst;
      }
}
