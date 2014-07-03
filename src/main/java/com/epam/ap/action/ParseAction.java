package com.epam.ap.action;

import javax.servlet.http.HttpServletRequest;

public class ParseAction implements Action {

    @Override
    public String execute(HttpServletRequest request) {
        // some parse actions and stuff

        String text = request.getParameter("text");
        request.setAttribute("text", text.toUpperCase());

        //return view
        return "WEB-INF/result.jsp";
    }
}
