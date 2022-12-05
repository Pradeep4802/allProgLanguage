/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;
import javax.servlet.*;
import java.util.*;
//import java.lang.*;
import java.io.*;

/**
 *
 * @author pradeepkumar
 */
public class FirstServlet implements Servlet{
    // Life cycle methods:
    
    ServletConfig conf;
    
    @Override
    public void init(ServletConfig conf) {
        this.conf=conf;
        System.out.println("Creating objects....");
    }
    
    @Override
    public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException {
        System.out.println("Servicing ................");
        // set the content type of the response
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>This is my output from servlet method:</h1>");
        out.println("<h1>Todays date and time is : "+new Date().toString()+"</h1>");
    }
    
    @Override
    public void destroy() {
        System.out.println("going to destroy servelet object");
    }
    
    @Override
    public ServletConfig getServletConfig() {
        return this.conf;
    }
    
    public String getServletInfo() {
        return "This servlet is created by Pradeep";
    }
}
