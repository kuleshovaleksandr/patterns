package main.java.patterns.structural.composite;

public class IntegerValue implements SubExpression {

    private Integer value;

    public IntegerValue(Integer value) {
        this.value = value;
    }

    @Override
    public Number value() {
        return value;
    }
}
