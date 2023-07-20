package com.telusko;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.*;

//import org.apache.tomcat.util.http.parser.Cookie;

import java.io.*;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k = 0;
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c : cookies) {
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
		
//		HttpSession session = req.getSession();
		
//		session.removeAttribute("k");
		
//		int k = Integer.parseInt(req.getParameter("k"));
//		int k = (int)session.getAttribute("k");
		
		k = k * k;
		
		PrintWriter out = res.getWriter();
		out.println("Result is : " + k); 
		
		System.out.println("sq called");
	}
}
