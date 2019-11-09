package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void service(HttpServletRequest request, HttpServletResponse response){
	try {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String a = request.getParameter("t1");
		String b = request.getParameter("t2");
		HttpSession ses = request.getSession(true);
		ses.setAttribute("x", a);
		ses.setAttribute("y", b);
		out.println("<html>");
		out.println("<form action = Second method = post>");
		out.println("enter address");
		out.println("<input type = text name = t3 size = 20><br>");
		out.println("enter phone no");
		out.println("<input type = text name =  t4 size = 20><br>");
		out.println("<input type = submit value = submit><br>");
		out.println("</form></html>");
		out.close();	
	}
	catch(Exception ae){
		ae.printStackTrace();
	}
	}

}
