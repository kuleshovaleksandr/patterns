package main.java.patterns.structural.composite;

public class FloatValue implements SubExpression {

    private Float value;

    public FloatValue(Float value) {
        this.value = value;
    }

    @Override
    public Number value() {
        return value;
    }
}
