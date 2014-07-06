package com.epam.ap.entity;

import com.epam.ap.utill.Parser;

public class Word extends AbstractCompoundText<Letter> implements TextPart {
    public Word(String word) {
        Components().addAll(Parser.parseCharacters(word));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Components().forEach(sb::append);
        sb.append(" ");
        return sb.toString();
    }
}
