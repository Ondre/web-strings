package com.epam.ap.action;

import com.epam.ap.entity.Sentence;
import com.epam.ap.entity.Text;
import com.epam.ap.entity.Word;
import com.epam.ap.utill.Parser;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

public class ParseAction implements Action {

    @Override
    public String execute(HttpServletRequest request) {
        // some parse actions and stuff

        String text = request.getParameter("text");
        Text d = Parser.parseText(text); //run Great-Parsing-Machine

        ArrayList<Sentence> sentences = new ArrayList<>();
        for (int i = 0; i < d.Components().size(); i++) {
            sentences.addAll(d.Components().get(i).Components());
        }
        ArrayList<Word> words = new ArrayList<>();
        for (int i = 0; i < d.Components().size(); i++) {
            for (int j = 0; j < d.Components().get(i).Components().size(); j++)
                words.addAll(d.Components().get(i).Components().get(j).Components());
        }


        request.setAttribute("text", d);
        request.setAttribute("paragraph", d.Components());
        request.setAttribute("sentence", sentences);
        request.setAttribute("word", words);

        //return view
        return "WEB-INF/result.jsp";
    }
}
