package fourvisitor;

/**
 * Represents an operation node with an operator (+, -, *, /) and two child nodes.
 */
public class OperationNode extends TreeMathExpression {
    private final String operator;
    private final TreeMathExpression left;
    private final TreeMathExpression right;

    public OperationNode(String operator, TreeMathExpression left, TreeMathExpression right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    public String getOperator() {
        return operator;
    }

    public TreeMathExpression getLeft() {
        return left;
    }

    public TreeMathExpression getRight() {
        return right;
    }

    @Override
    public void accept(MathVisitor visitor) {
        visitor.visit(this);
    }
}
