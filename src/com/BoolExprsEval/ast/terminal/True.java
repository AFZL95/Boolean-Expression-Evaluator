package com.BoolExprsEval.ast.terminal;

/**
 * Created by FZL on 6/28/2016.
 */

import com.BoolExprsEval.ast.Terminal;

public class True extends Terminal {
    public True() {
        super(true);
    }

    public boolean interpret() {
        return value;
    }
}
