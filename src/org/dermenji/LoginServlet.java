package org.dermenji;

import com.sun.org.apache.regexp.internal.RE;
import org.dermenji.dto.User;
import org.dermenji.service.LoginService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId, password;
        userId = request.getParameter("userId");
        password =request.getParameter("password");

        LoginService loginService = new LoginService();
        boolean result = loginService.authenticate(userId, password);

        if (result){
            User user = loginService.getUserDetails(userId);
            request.getSession().setAttribute("user", user);
            RequestDispatcher dispatcher =  request.getRequestDispatcher("succes.jsp");
            dispatcher.forward(request, response);
            return;
        } else {
            response.sendRedirect("login.jsp");
            return;
        }
    }

}
