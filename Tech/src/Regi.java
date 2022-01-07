import java.io.*;
import javax.servlet.annotation.*;

import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/Regi")
public class Regi extends HttpServlet {
		
		public void doPost(HttpServletRequest request,HttpServletResponse response)  throws IOException
		{
			try{
				PrintWriter out = response.getWriter();
				String check = request.getParameter("name");
				
				out.print(check);
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
}