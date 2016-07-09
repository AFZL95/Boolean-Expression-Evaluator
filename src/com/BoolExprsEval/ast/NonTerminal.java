package com.BoolExprsEval.ast;

/**
 * Created by FZL on 6/27/2016.
 */

public abstract class NonTerminal implements BooleanExpression {
    protected BooleanExpression left, right;

    public void setLeft(BooleanExpression left) {
        this.left = left;
    }

    public void setRight(BooleanExpression right) {
        this.right = right;
    }
}