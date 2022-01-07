package com.klp;
import java.io.*;
import  java.lang.*;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NewLogin extends HttpServlet{
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text.html");
		PrintWriter out = res.getWriter();
		req.getRequestDispatcher("link.html").include(req,res);
		String Name = req.getParameter("uName");
		String pass = req.getParameter("pass");
		
		if(pass.equals("admin123"))
		{
			out.print("You logged in successfully");
			out.print("welcome "+ Name);
			
			Cookie ck = new Cookie("Name",Name);
			res.addCookie(ck);
		}
		else{
			out.print("please check the password");
			req.getRequestDispatcher("login.html").include(req,res);
			
		}
		
	}

}
