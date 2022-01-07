package com.tech.blog.servlet;
import javax.servlet.annotation.*;
import java.io.*;
import com.tech.blog.dao.*;

import com.tech.blog.entity.*;
import com.tech.blog.helper.*;
import javax.servlet.*;
import javax.servlet.http.*;

@MultipartConfig

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
		
		
		public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
		{
			try{
				PrintWriter out = response.getWriter();
				out.print("hello");
				
				
				
				
			}catch(Exception e)
			{
				
			}
		}
	
}
