package com.klp;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class DynamicTaghandler extends TagSupport{
	
	public void setNumber(int number) {
		this.number = number;
	}

	
	public int number ;
	//public String color;
	JspWriter out = pageContext.getOut();
	
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		try{
			for(int i = 0;i<=10;i++)
			{
				out.print((i*number)+"<br>");
			}
			
		}
		catch(Exception e)
		{
		
		}
		return SKIP_BODY;
	}
}