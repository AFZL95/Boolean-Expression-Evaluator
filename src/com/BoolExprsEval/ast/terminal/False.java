package com.BoolExprsEval.ast.terminal;

/**
 * Created by FZL on 6/28/2016.
 */

import com.BoolExprsEval.ast.Terminal;

public class False extends Terminal {
    public False() {
        super(false);
    }

    public boolean interpret() {
        return value;
    }
}