package com.epam.ap.entity;

import java.util.List;

public abstract class AbstractCompoundText<T extends TextPart> implements CompoundText {

    //Text extends AbstractCompoundText<Paragraph>

    private List<T> components;

    public T getElement(int index) {return null;}
}
