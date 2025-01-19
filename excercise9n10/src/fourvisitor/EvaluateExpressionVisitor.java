package fourvisitor;

/**
 * Evaluates the mathematical expression represented by the tree.
 */
public class EvaluateExpressionVisitor implements MathVisitor {
    private double result;

    @Override
    public void visit(TerminalNode node) {
        result = node.getValue();
    }

    @Override
    public void visit(OperationNode node) {
        node.getLeft().accept(this);
        double leftValue = result;

        node.getRight().accept(this);
        double rightValue = result;

        switch (node.getOperator()) {
            case "+" -> result = leftValue + rightValue;
            case "-" -> result = leftValue - rightValue;
            case "*" -> result = leftValue * rightValue;
            case "/" -> result = leftValue / rightValue;
            default -> throw new IllegalArgumentException("Unsupported operator: " + node.getOperator());
        }
    }

    public double getResult() {
        return result;
    }
}
