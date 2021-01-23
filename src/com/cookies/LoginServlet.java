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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside post");
		// it create new request
		//response.sendRedirect("http://www.google.com");  
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
        System.out.println(name);
        
        request.getRequestDispatcher("index.html").include(request, response);
        HttpSession session=request.getSession();
        session.setAttribute("name", name);
		System.out.println(session.getId());
		session.setMaxInactiveInterval(10);
        if(password.equals("1234")){  
            out.print("You are successfully logged in!");  
            out.print("<br>Welcome, "+name); 
            
            /*Cookie ck=new Cookie("name",password);  
            response.addCookie(ck); */ 
            
        }else{  
            out.print("sorry, username or password error!");  
            request.getRequestDispatcher("logIn.html").include(request, response);  
        }  
          
        out.close();  
	}

}
