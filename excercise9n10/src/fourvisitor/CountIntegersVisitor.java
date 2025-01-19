package fourvisitor;

/**
 * Counts the number of terminal nodes (integers) in the tree.
 */
public class CountIntegersVisitor implements MathVisitor {
    private int integerCount = 0;

    @Override
    public void visit(TerminalNode node) {
        integerCount++;
    }

    @Override
    public void visit(OperationNode node) {
        node.getLeft().accept(this);
        node.getRight().accept(this);
    }

    public int getIntegerCount() {
        return integerCount;
    }
}
