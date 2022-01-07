package com.klp;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class NewReg extends HttpServlet{

	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h2>welcome to registered servlet</h2>");
		String name = req.getParameter("Myname");
		String pass = req.getParameter("pass");
		String mail = req.getParameter("mail");
		String gender = req.getParameter("gender");
		String course = req.getParameter("course");
		String con = req.getParameter("check");
		
		if(con != null)
		{
			out.println("<h2>Name : "+name+"</h2>");
			out.println("<h2>Password : "+pass+"</h2>");
			out.println("<h2>Email : "+mail+"</h2>");
			out.println("<h2>gender : "+gender+"</h2>");
			out.println("<h2>Course : "+course+"</h2>");
		}
		else
		{
			out.println("Please agree with our conditions");
		}
	}
}
