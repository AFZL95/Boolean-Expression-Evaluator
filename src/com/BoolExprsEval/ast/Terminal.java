package com.BoolExprsEval.ast;

/**
 * Created by FZL on 6/27/2016.
 */

public abstract class Terminal implements BooleanExpression{
    protected boolean value;

    public Terminal(boolean value) {
        this.value = value;
    }

    public String toString() {
        return String.format("%s", value);
    }
}