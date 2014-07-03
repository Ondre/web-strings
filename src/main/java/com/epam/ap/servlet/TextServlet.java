package com.epam.ap.servlet;

import com.epam.ap.action.Action;
import com.epam.ap.action.ActionFactory;
import com.epam.ap.action.ParseAction;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        Action action = ActionFactory.getAction("parse");
        String result = action.execute(request);

        request.getRequestDispatcher(result).forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
    }
}
