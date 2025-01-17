package session10.visitors;

import org.junit.jupiter.api.Test;
import session10.mathexpression.MathExpression;
import session10.mathexpression.Node;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateVisitorTest {

    @Test
    void visit() {
        MathExpression mathExpression = new MathExpression();
        mathExpression.parse("3 + 2 + 4 - 5 + 10 =");

        EvaluateVisitor visitor =  new EvaluateVisitor();
        for (Node node: mathExpression){
            visitor.visit(node);
        }

        assertEquals(14, visitor.getResult());
    }
}