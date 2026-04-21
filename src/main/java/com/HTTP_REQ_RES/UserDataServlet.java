package com.HTTP_REQ_RES;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/processUser")
public class UserDataServlet extends HttpServlet {
 @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {

       String username = request.getParameter("username");
       String email = request.getParameter("email");
       String designation = request.getParameter("designation");

       String message;

       if (username == null || username.trim().isEmpty()) {
           message = "Username is required";
       } else {
           message = "User data processed successfully";

           request.setAttribute("username", username);
           request.setAttribute("email", email);
           request.setAttribute("designation", designation);
       }

       request.setAttribute("message", message);

       RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
       dispatcher.forward(request, response);
   }

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {

       response.sendRedirect("index.jsp");
   }
}
