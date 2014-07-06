package com.epam.ap.utill;

import com.epam.ap.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    //todo: add dividing by numbers and non-letter symbols
    private static final String regexParagraph = "\\n+";
    private static final String regexSentence = "(?<=[.?!])(?:\\s+)";//(\S)
    private static final String regexWord = "((\\b[^\\s0-9]+\\b)((?<=\\.\\w).)?)";
    private static final String regexChar = "";

    public static Text parseText(String string) {
        return new Text(string);
    }

    public static List<Paragraph> parseParagraphs(String text) {
        String[] lines = text.split(regexParagraph);
        List<Paragraph> paragraphs = new ArrayList<>();
        for (String line : lines) {
            paragraphs.add(new Paragraph(line));
        }
        return paragraphs;
    }

    public static List<Sentence> parseSentences(String paragraph) {
        String[] lines = paragraph.split(regexSentence);
        List<Sentence> sentences = new ArrayList<>();
        for (String line : lines) {
            sentences.add(new Sentence(line));
        }
        return sentences;
    }

    public static List<Word> parseWords(String sentence) {
        List<Word> words = new ArrayList<>();
        Pattern p = Pattern.compile(regexWord, Pattern.UNICODE_CHARACTER_CLASS);
        Matcher m = p.matcher(sentence);
        while (m.find()) {
            String[] group = m.group().split("\\s");
            for (String line : group) {
                words.add(new Word(line));
            }
        }
        return words;
    }

    public static List<Letter> parseCharacters(String word) {
        String[] lines = word.split(regexChar);
        List<Letter> symbols = new ArrayList<>();
        for (String line : lines) {
            symbols.add(new Letter(line));
        }
        return symbols;
    }
}
