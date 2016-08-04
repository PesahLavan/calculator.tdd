package com.example.calculator.operation;

public class DividedOperation implements BaseOperation {
    private final int value;

    public DividedOperation(int value) {
        this.value = value;
    }

    @Override
    public int apply(int prevValue) {
        return prevValue / value;
    }
}
