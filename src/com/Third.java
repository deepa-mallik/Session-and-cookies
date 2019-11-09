package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Third")
public class Third extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response){
	try {	response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String e = request.getParameter("t5");
		String f = request.getParameter("t6");
		HttpSession ses = request.getSession(false);
		ses.setAttribute("i", e);
		ses.setAttribute("j", f);
		String a = (String)ses.getAttribute("x");
		String b = (String)ses.getAttribute("y");
		String c = (String)ses.getAttribute("g");
		String d = (String)ses.getAttribute("h");
		out.println("name is "+a);
		out.println("password is "+b);
		out.println("address is "+c);
		out.println("Phone no is "+d);
		out.println("Hobby is "+e);
		out.println("email is "+f);
		
		out.close();
	}catch(Exception ae) {
		ae.printStackTrace();
	}
	}

}
