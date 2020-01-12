package com.vikram.action;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.DriverManager;
import java.sql.SQLException;
public class Connection {

	public static void main(String[] args)
	{
		
		System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        } 
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;
        try
        {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/restdb", "root", "root");
            System.out.println("SQL Connection to database established!");
 
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            return;
        } finally {
            try
            {
                if(connection != null)
                    ((ResultSet) connection).close();
                System.out.println("Connection closed !!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
 