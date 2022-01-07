package com.tech.blog.servlet;
import javax.servlet.annotation.*;
import java.io.*;
import com.tech.blog.dao.*;
import com.tech.blog.entity.*;
import com.tech.blog.helper.*;
import javax.servlet.*;
import javax.servlet.http.*;

@MultipartConfig

@WebServlet("/Register")
public class Register extends HttpServlet {
		
		public void doPost(HttpServletRequest request,HttpServletResponse response) 
		{
			try{
				PrintWriter out = response.getWriter();
				String check = request.getParameter("user_check");
				
				if(check==null)
				{
					out.print("do check box");
				}
				else{
					String name = request.getParameter("user_name");
					String email = request.getParameter("user_email");
					String password = request.getParameter("user_password");
					String gender = request.getParameter("user_gender");
					String about = request.getParameter("user_about");
					
					//create user object and set all data to that object
					User user = new User(name,email,password,gender,about);
					
					
					
					//create user dao object
					UserDao dao = new UserDao(ConnectionProvider.getConnection());
					if(dao.saveUser(user))
					{
						out.println("done");
					}
					else{
						out.println("error");
					}
				}
				
				
			}catch(Exception e)
			{
				
			}
		}
	
}
