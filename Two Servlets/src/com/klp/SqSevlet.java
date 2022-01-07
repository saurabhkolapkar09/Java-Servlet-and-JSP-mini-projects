package com.klp;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
public class SqSevlet extends HttpServlet{
	public void service(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
		//String name = req.getParameter("name");
		PrintWriter out = res.getWriter();
		out.print("welcome");
	}
}
