package main.java.patterns.structural.composite;

public class Demo {
    public static void main(String[] args) {
        // Вычислим выражение - 50 - (10-2) - (11+10)
        // Приведем к следующему виду 20 - a - b
        Expression expr = new Expression();

        SubExpression a = new Expression(new IntegerValue(10), new IntegerValue(-2));
        SubExpression b = new Expression(new IntegerValue(11), new IntegerValue(10));

        expr.add(new IntegerValue(50));
        expr.sub(a);
        expr.sub(b);

        System.out.println(expr.value());
    }
}
