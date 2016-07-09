package com.BoolExprsEval.ast.nonterminal;

/**
 * Created by FZL on 6/28/2016.
 */

import com.BoolExprsEval.ast.NonTerminal;
import com.BoolExprsEval.ast.BooleanExpression;

public class Not extends NonTerminal {
    public void setChild(BooleanExpression child) {
        setLeft(child);
    }

    public void setRight(BooleanExpression right) {
        throw new UnsupportedOperationException();
    }

    public boolean interpret() {
        return !left.interpret();
    }

    public String toString() {
        return String.format("!%s", left);
    }
}
