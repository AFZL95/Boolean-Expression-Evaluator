package com.BoolExprsEval.ast;

/**
 * Created by FZL on 6/27/2016.


 /**
 * <expression>::=<term>{<or><term>}
 * <term>::=<factor>{<and><factor>}
 * <factor>::=<constant>|<not><factor>|(<expression>)
 * <constant>::= false|true
 * <or>::='|'
 * <and>::='&'
 * <not>::='!'
 */

public interface BooleanExpression {
    public boolean interpret();
}
