package com.klp;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.*;

import java.io.*;

public class MyServlet extends HttpServlet{
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		
		PrintWriter out = res.getWriter();
		out.print("please wloe");
	}
}
