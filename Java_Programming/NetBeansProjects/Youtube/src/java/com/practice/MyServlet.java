package com.practice;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class MyServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        System.out.println("This is get method..........");
        
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        out.print("<h1>This is get method of my servlet </h1>");
        out.print(new Date().toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    
    
}
