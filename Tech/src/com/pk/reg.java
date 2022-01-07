package com.pk;

import java.io.*;
import javax.servlet.annotation.*;

import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/reg")
public class reg extends HttpServlet {
		
		public void doPost(HttpServletRequest request,HttpServletResponse response)  throws IOException
		{
			try{
				PrintWriter out = response.getWriter();
				String check = request.getParameter("name");
				
				out.print("htrstrs");
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
}