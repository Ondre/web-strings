package com.epam.ap.entity;

import com.epam.ap.utill.Parser;

public class Sentence extends AbstractCompoundText<Word> implements TextPart {
    public Sentence(String sentence) {
        Components().addAll(Parser.parseWords(sentence));
    }
}
