package com.epam.ap.entity;

import com.epam.ap.utill.Parser;

public class Paragraph extends AbstractCompoundText<Sentence> implements TextPart {
    public Paragraph(String paragraph) {
        Components().addAll(Parser.parseSentences(paragraph));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Components().forEach(sb::append);
        sb.append("\n");
        return sb.toString();
    }
}
