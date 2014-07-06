package com.epam.ap.entity;

public class Letter implements TextPart {
    private char letter;

    public Letter(String line) {
        letter = line.toCharArray()[0];
    }

    @Override
    public String toString() {
        return "" + letter;
    }
}
