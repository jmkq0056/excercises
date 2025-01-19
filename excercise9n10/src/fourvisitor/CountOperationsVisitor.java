package fourvisitor;

/**
 * Counts the number of operation nodes in the tree.
 */
public class CountOperationsVisitor implements MathVisitor {
    private int operationCount = 0;

    @Override
    public void visit(TerminalNode node) {
        // No operation nodes in terminal nodes
    }

    @Override
    public void visit(OperationNode node) {
        operationCount++;
        node.getLeft().accept(this);
        node.getRight().accept(this);
    }

    public int getOperationCount() {
        return operationCount;
    }
}
