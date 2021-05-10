package servlets;

import models.Equation;
import util.ParserEq;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/calculate")
public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String string = request.getParameter("equation");

        Equation.setEquation(string);

        ParserEq.setResult(ParserEq.parse(string));

        RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/main.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/main.jsp");
        dispatcher.forward(request, response);
    }
}
