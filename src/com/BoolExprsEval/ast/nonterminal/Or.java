package com.BoolExprsEval.ast.nonterminal;

/**
 * Created by FZL on 6/28/2016.
 */

import com.BoolExprsEval.ast.NonTerminal;

public class Or extends NonTerminal {
    public boolean interpret() {
        return left.interpret() || right.interpret();
    }

    public String toString() {
        return String.format("(%s | %s)", left, right);
    }
}
