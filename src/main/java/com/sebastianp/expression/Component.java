package com.sebastianp.expression;

import static com.sebastianp.expression.ComponentType.*;

public class Component {
    private String value;

    private ComponentType type;

    public Component(String value){
        for (Operator operator : Operator.values()) {
            String operationSign = operator.getSign();
            if (value.equals(operationSign)) {
                type = OPERATOR;
                return;
            }
        }

        try {
            Double.parseDouble(value);
        } catch (NumberFormatException e) {
            type = VARIABLE;
            return;
        }
        type = CONSTANT;
    }

    public ComponentType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
