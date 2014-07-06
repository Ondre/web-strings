package com.epam.ap.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCompoundText<T extends TextPart> implements CompoundText {
    private List<T> components;

    AbstractCompoundText() {
        components = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        components.forEach(sb::append);
        return sb.toString();
    }

    public List<T> Components() {
        return components;
    }

    public T getElement(int index) {
        return null;
    }
}
