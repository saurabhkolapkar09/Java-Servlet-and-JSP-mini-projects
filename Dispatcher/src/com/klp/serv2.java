package com.klp;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

import java.io.*;
public class serv2 extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		out.print("welcome");
	}
}
