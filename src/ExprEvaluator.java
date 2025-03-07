package src;

public class ExprEvaluator implements ExprVisitor<Float> {
    @Override
    public Float visit(PlusExpr expr) {
        return expr.getE1().eval() + expr.getE2().eval();
    }

    @Override
    public Float visit(MinusExpr expr) {
        return expr.getE1().eval() - expr.getE2().eval();
    }

    @Override
    public Float visit(TimesExpr expr) {
        return expr.getE1().eval() * expr.getE2().eval();
    }

    @Override
    public Float visit(DivExpr expr) {
        return expr.getE1().eval() / expr.getE2().eval();
    }

    @Override
    public Float visit(FloatExpr expr) {
        return expr.eval();
    }
}
