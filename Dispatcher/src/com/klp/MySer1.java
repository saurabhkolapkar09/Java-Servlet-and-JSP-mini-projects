package com.klp;
import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MySer1 extends HttpServlet{
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter out = res.getWriter();
		String s = req.getParameter("username");
		String p = req.getParameter("pass");
		//if(s == "saurabh" && p =="saurabh123")
		//{
		//	RequestDispatcher rd = req.getRequestDispatcher("se");
			//rd.forward(req, res);
		//}
		//else{
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			out.print("error in username or in password");
			rd.include(req, res);
			
		//}
	}
}
