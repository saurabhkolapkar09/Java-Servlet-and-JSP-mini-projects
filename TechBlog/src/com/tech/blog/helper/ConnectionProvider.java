package com.tech.blog.helper;
import java.sql.*;
public class ConnectionProvider{
	private static Connection con = null;
	public static Connection getConnection()
	{
		try{
			if(con == null)
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/techblog";
				String username = "root";
				String pass = "1234";
				//String sql = "select * from employee where idEmployee = 1";

				con = DriverManager.getConnection(url,username,pass);

			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
	
}
