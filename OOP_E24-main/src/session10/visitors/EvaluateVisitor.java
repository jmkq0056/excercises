package session10.visitors;


import session10.mathexpression.*;

public class EvaluateVisitor implements Visitor {

    private int result;
    private int currentInteger;
    OperationNode lastOperation=null;
    boolean holding=false;

    public EvaluateVisitor() {
        this.result = 0;
    }

    @Override
    public void visit(Element node) {

        if (node instanceof IntegerNode){
            currentInteger = ((IntegerNode) node).getIntValue();
            if (lastOperation==null){
                this.result=currentInteger;
            } else {
                this.result = lastOperation.apply(this.result,this.currentInteger);
            }
        }else if (node instanceof OperationNode){
            this.lastOperation= (OperationNode)node;
        }

    }

    @Override
    public String toString() {
        return "Evaluator{" +
                "result=" + result +
                '}';
    }

    public int getResult() {
        return this.result;
    }
}
