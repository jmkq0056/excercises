package fourvisitor;

/**
 * Abstract class representing a mathematical expression tree node.
 */
public abstract class TreeMathExpression {
    public abstract void accept(MathVisitor visitor);
}
