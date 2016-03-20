package com.mohbajal.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 908752 on 3/19/16.
 */
public class LoginControllerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        System.out.println(request.getParameter("login"));

        PrintWriter out = response.getWriter();

        if("bajal".equalsIgnoreCase(request.getParameter("login")))
            out.print("success");
        else
            out.print("failure");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }
}
