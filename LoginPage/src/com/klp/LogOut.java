package com.klp;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogOut extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text.html");
		PrintWriter out = res.getWriter();
		req.getRequestDispatcher("link.html").include(req, res);
		
		Cookie ck = new Cookie("Name" ,"");
		ck.setMaxAge(0);
		res.addCookie(ck);
		out.print("your logged out successfully !!");
	}

}
