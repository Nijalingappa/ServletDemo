package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletParent
 */
@WebServlet(value="/ServletParent",loadOnStartup = 1)
public class ServletParent implements Servlet {
	private static final long serialVersionUID = 1L;
	ServletConfig config=null;
	
    public ServletParent() {
        super();
        System.out.println("ServletParent instance");
    }

	@Override
	public void destroy() {
		System.out.println("ServletParent destroy");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("ServletParent config");
		return config;
	}

	@Override
	public String getServletInfo() {
		System.out.println("ServletParent info");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		this.config=arg0;  
		System.out.println("ServletParent is initialized");  
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");  
		PrintWriter out=res.getWriter();  
		out.print("<html><body>");  
		out.print("<b>hello simple servle parent</b>");  
		out.print("</body></html>");  
		//System.out.println(getServletConfig());
	}
	

}
