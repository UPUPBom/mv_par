package com.xue;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")
public class userController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        UserService userService = new UserService();

        String userName = request.getParameter("userName");

        String passWorld = request.getParameter("passWorld");

        userService.userService(userName,passWorld);

        System.out.println("web层输出"+userName + "=="+passWorld);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
        System.out.println("1111");
    }
}
