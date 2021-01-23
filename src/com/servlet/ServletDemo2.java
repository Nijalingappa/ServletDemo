package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo2
 */
@WebServlet(urlPatterns="/ServletDemo2",loadOnStartup=1)
public class ServletDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletDemo2() {
   	 System.out.println("ServletDemo2 con()");
   }
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("initialised ServletDemo2");
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter wr=response.getWriter();
		wr.print("<html><body>");
		wr.print("<h3>Hello second servlet</h3>");
		wr.print("</body></html");
	}

}
