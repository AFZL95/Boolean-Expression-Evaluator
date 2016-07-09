package com.BoolExprsEval.ast;

/**
 * Created by FZL on 6/27/2016.
 */

import com.BoolExprsEval.ast.nonterminal.And;
import com.BoolExprsEval.ast.nonterminal.Not;
import com.BoolExprsEval.ast.nonterminal.Or;
import com.BoolExprsEval.ast.terminal.False;
import com.BoolExprsEval.ast.terminal.True;

public class Test {
    public static void main(String[] args) {
        True t = new True();
        False f = new False();

        Or or = new Or();
        or.setLeft(t);
        or.setRight(f);

        Not not = new Not();
        not.setChild(f);
        And and = new And();
        and.setLeft(or);
        and.setRight(not);

        BooleanExpression root = and;

        System.out.println(root);
        System.out.println(root.interpret());
    }
}