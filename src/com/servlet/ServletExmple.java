package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletExmple
 */
@WebServlet(urlPatterns="/ServletExmple",loadOnStartup = 1)
public class ServletExmple extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("initialised ServletExmple");
	}
	
    public ServletExmple() {
       System.out.println("ServletExmple con()");
    }
    
    /*@Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	System.out.println("inside protected service");
    	super.service(arg0, arg1);
    	doGet(arg0, arg1);
    }
@Override
public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
	// TODO Auto-generated method stub
	System.out.println("inside public service");
	super.service(arg0, arg1);
}*/
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter wr=response.getWriter();
		wr.print("<html><body>");
		wr.print("<h3>Hello first servlet</h3>");
		wr.print("</body></html");
		  
		System.out.println(getLastModified(request));
		//RequestDispatcher rd=request.getRequestDispatcher("ServletDemo2");
		//rd.forward(request, response);
				
		//response.sendRedirect("ServletDemo2");
		
	}
	
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("ServletExmple destroy");
	}

}
