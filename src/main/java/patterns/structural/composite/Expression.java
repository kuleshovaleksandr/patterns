package main.java.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Expression implements SubExpression {

    private List<SubExpression> expressions;

    public Expression(SubExpression ... expressions) {
        this.expressions = new ArrayList<SubExpression>();
        for (SubExpression expr: expressions) {
            this.expressions.add(expr);
        }
    }

    public void add(SubExpression expr) {
        expressions.add(expr);
    }

    public void sub(SubExpression expr) {
        if (expr instanceof IntegerValue) {
            expressions.add(new IntegerValue(-1*expr.value().intValue()));
        } else {
            expressions.add(new FloatValue(-1*expr.value().floatValue()));
        }
    }

    public SubExpression getSubExpression(int index) {
        return expressions.get(index);
    }

    @Override
    public Number value() {

        Number result = (float) 0;

        for (SubExpression expr: expressions) {
            result = result.floatValue() + expr.value().floatValue();
        }

        return result;
    }
}
