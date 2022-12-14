/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ServletTesting;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

/**
 *
 * @author pradeepkumar
 */
public class SuccessServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("This is success servlet");
        out.println("<h2>Successfully registered </h2>");
        
        
    }
    
}
