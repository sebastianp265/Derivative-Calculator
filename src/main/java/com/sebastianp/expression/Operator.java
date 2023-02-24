package com.sebastianp.expression;

public enum Operator {
    ADD ("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private String sign;

    private Operator(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }
}
