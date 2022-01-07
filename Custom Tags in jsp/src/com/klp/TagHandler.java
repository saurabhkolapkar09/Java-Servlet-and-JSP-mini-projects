package com.klp;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
//<%@taglib uri = "WEB-INF/TLDfile.tld" prefix = "t" %>
public class TagHandler extends TagSupport{

	public void setNumber(int number) {
		this.number = number;
	}
	public int number;
	
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		
		
		
		JspWriter out = pageContext.getOut();
		try{
			//task
			
			out.print("<h1>Hello sudents</h1>");
			for(int i = 0 ;i<10 ;i++)
			{
				out.print((i*number)+"<br>");
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		
		
		
		//if we want to skip the body of the tag
		return SKIP_BODY;
	}
	
	
}
