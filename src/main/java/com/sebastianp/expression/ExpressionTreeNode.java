package com.sebastianp.expression;

import static com.sebastianp.expression.ComponentType.*;

public class ExpressionTreeNode {

    private boolean isLeaf = true; // leafs are only variables or numbers
    private Component component;

    private ExpressionTreeNode left;
    private ExpressionTreeNode right;

    public ExpressionTreeNode(ExpressionTreeNode left, ExpressionTreeNode right, String value) {
        Component component = new Component(value);
        ComponentType componentType = component.getType();
        if( (componentType == VARIABLE || componentType == CONSTANT) && (left != null || right != null)) {
            throw new IllegalArgumentException("Variable or Constant has to be leaf of a tree - it cannot have children");
        }

        this.left = left;
        this.right = right;
        this.component = component;
    }
}
