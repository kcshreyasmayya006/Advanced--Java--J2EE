package com.student.result;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String rollno = request.getParameter("rollno");
        String studentname = request.getParameter("studentname");

        int sub1 = Integer.parseInt(request.getParameter("sub1"));
        int sub2 = Integer.parseInt(request.getParameter("sub2"));
        int sub3 = Integer.parseInt(request.getParameter("sub3"));
        int sub4 = Integer.parseInt(request.getParameter("sub4"));
        int sub5 = Integer.parseInt(request.getParameter("sub5"));

        String message = "";

        if (rollno == null || rollno.trim().isEmpty() ||
            studentname == null || studentname.trim().isEmpty()) {
            message = "Invalid input";
        }

        if (sub1 < 0 || sub1 > 100 || sub2 < 0 || sub2 > 100 ||
            sub3 < 0 || sub3 > 100 || sub4 < 0 || sub4 > 100 ||
            sub5 < 0 || sub5 > 100) {
            message = "Marks should be between 0 and 100";
        }

        double average = (sub1 + sub2 + sub3 + sub4 + sub5) / 5.0;

        String result = "Pass";
        if (sub1 < 40 || sub2 < 40 || sub3 < 40 || sub4 < 40 || sub5 < 40) {
            result = "Fail";
        }

        request.setAttribute("rollno", rollno);
        request.setAttribute("studentname", studentname);
        request.setAttribute("sub1", sub1);
        request.setAttribute("sub2", sub2);
        request.setAttribute("sub3", sub3);
        request.setAttribute("sub4", sub4);
        request.setAttribute("sub5", sub5);
        request.setAttribute("average", average);
        request.setAttribute("result", result);
        request.setAttribute("message", message);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}


