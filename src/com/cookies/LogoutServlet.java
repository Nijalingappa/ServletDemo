package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LogoutServlet() doGet()");
		response.setContentType("text/html");  
	        
		 PrintWriter out=response.getWriter();  
	        
		 request.getRequestDispatcher("index.html").include(request, response);  
	          
	       /* Cookie ck=new Cookie("name","");  
	        ck.setMaxAge(0);  
	        response.addCookie(ck); */ 
		 HttpSession session=request.getSession(false);
		 if(session!=null){
			 System.out.println("session value "+session);
			 System.out.println(session.getAttribute("name"));
			 System.out.println("session timeout "+session.getMaxInactiveInterval());
	         //session.invalidate();
		        out.print("you are successfully logged out!"); 
		 }
		 else{
			// request.getRequestDispatcher("index.html").include(request, response);
			 System.out.println(session.getAttribute("name"));
			 out.print("you are already logged out! Please login"); 
		 }
		   
	}


}
