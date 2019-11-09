package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Second")
public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) {
	try {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String c = request.getParameter("t3");
		String d = request.getParameter("t4");
		HttpSession ses = request.getSession(false);
		ses.setAttribute("g", c);
		ses.setAttribute("h", d);
		out.println("<html>");
		out.println("<form action = Third method = post>");
		out.println("enter hobby");
		out.println("<input type = text name = t5 size = 20><br>");
		out.println("enter phone no");
		out.println("<input type = text name =  t6 size = 20><br>");
		out.println("<input type = submit value = submit><br>");
		out.println("</form></html>");
		out.close();
	}catch(Exception ae) {
		ae.printStackTrace();
	}
	}

}
