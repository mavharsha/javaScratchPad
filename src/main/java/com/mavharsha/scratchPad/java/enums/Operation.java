package com.mavharsha.scratchPad.java.enums;

import java.util.function.DoubleBinaryOperator;

/*
* Joshua Bloch - Effective Java
* Using functional interface for ENUMS instead of abstract methods
* */
public enum  Operation {

    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    TIMES("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> x / y),
    MODULO("%", (x, y) -> x % y);


    private String symbol;
    private DoubleBinaryOperator operator;
    Operation(String symbol, DoubleBinaryOperator operator){
        this.symbol = symbol;
        this.operator = operator;
    }

    public double apply(double firstInput, double secondInput) {
        return this.operator.applyAsDouble(firstInput, secondInput);
    }

    public String getSymbol() {
        return this.symbol;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
