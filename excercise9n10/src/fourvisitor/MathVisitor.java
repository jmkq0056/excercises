package fourvisitor;

/**
 * Visitor interface for performing operations on the tree.
 */
public interface MathVisitor {
    void visit(TerminalNode node);
    void visit(OperationNode node);
}
