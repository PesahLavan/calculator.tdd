package com.example.calculator.operation;

public class InitialOperation implements BaseOperation {

    private final int value;

    public InitialOperation(int value) {
        this.value = value;
    }

    @Override
    public int apply(int prevValue) {
        return value;
    }
}
