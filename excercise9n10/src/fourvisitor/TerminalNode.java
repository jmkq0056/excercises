package fourvisitor;

/**
 * Represents a terminal node holding an integer value.
 */
public class TerminalNode extends TreeMathExpression {
    private final int value;

    public TerminalNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void accept(MathVisitor visitor) {
        visitor.visit(this);
    }
}
