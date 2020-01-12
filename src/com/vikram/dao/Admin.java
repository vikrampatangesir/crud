package com.vikram.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin 
{
	

	public static 	Connection getConnection()
	{
		
		Connection con = null;
		System.out.println(con);
		
		try 
		{
			  Class.forName("com.mysql.jdbc.Driver");
			  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vikram","root","root");
			  System.out.println("Cone tion:"+con);
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
		
	}
	
	// method for save user data in database
		public int registerUser(String uname, String uemail, String upass, String udeg) throws Exception
		{
			System.out.println("inside registerUser");
			
			int i = 0;
			try {
				String sql = "INSERT INTO STRUTS2CRUD VALUES (?,?,?,?)";
				PreparedStatement ps = getConnection().prepareStatement(sql);
				ps.setString(1, uname);
				ps.setString(2, uemail);
				ps.setString(3, upass);
				ps.setString(4, udeg);
				i = ps.executeUpdate();
				return i;
			} catch (Exception e) {
				e.printStackTrace();
				return i;
			} 
			finally
			{
				if (getConnection() != null)
				{
					getConnection().close();
				}
			}
}
}
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

