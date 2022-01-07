package com.tech.blog.dao;
import java.sql.*;
import com.tech.blog.entity.*;
//this class interact with database
public class UserDao {
	private Connection con;

	public UserDao(Connection con) {
		
		this.con = con;
	}
	
	//method to insert user_data to data
	public boolean saveUser(User user)
	{
		boolean f = false;
		try{
			//user->database connection
			String query = "insert into user(name,email,password,gender,about) values (?,?,?,?,?)";
			PreparedStatement pstmt = this.con.prepareStatement(query);
			
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());
			pstmt.setString(4, user.getGender());
			pstmt.setString(5, user.getAbout());
			
			
			
			pstmt.executeUpdate();
			
			f=true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
		
	}
	
	
	//get user by useremail and password
	public User getUserByEmailAndPassword(String email,String password)
	{
		User user=null;
		try{
			String query="select * from user where email=? and password=?";
			PreparedStatement pstmt =con.prepareStatement(query);
			pstmt.setString(1,email);
			pstmt.setString(2, password);
			
			ResultSet set = pstmt.executeQuery();
			if(set.next())
			{
				user = new User();
				
				//getting data from database
				
				String name = set.getString("name");
				
				//set to user obbject
				
				user.setName(name);
				
				
				
				
				
				int id = set.getInt("id");
				user.setId(id);
				
				user.setEmail(set.getString("email"));
				
				user.setPassword(set.getString("password"));
				
				user.setAbout(set.getString("about"));
				
				user.setGender(set.getString("gender"));
				
				user.setProfile(set.getString("profile"));
					
				
			}
			
			
			}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return user;
	}
}
