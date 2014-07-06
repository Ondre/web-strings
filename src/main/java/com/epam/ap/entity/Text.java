package com.epam.ap.entity;

import com.epam.ap.utill.Parser;

public class Text extends AbstractCompoundText<Paragraph> implements TextPart {
    public Text(String text) {
        Components().addAll(Parser.parseParagraphs(text));
    }
}
