package com.klp;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class Profile extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text.html");
		PrintWriter out = res.getWriter();
		Cookie ck[] = req.getCookies();
		if(ck!=null)
		{
			String name = ck[0].getValue();
			
			if(!name.equals("") || name!=null)
			{
				out.print("Hii "+name +" welcome");
				
			}
			
		}
		else{
			out.print("do login first");
			req.getRequestDispatcher("login.html").include(req,res );
		}
	}
}
