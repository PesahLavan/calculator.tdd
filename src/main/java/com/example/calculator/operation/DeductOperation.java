package com.example.calculator.operation;

public class DeductOperation implements BaseOperation {
    private final int value;

    public DeductOperation(int value) {
        this.value = value;
    }

    @Override
    public int apply(int prevValue) {
        return prevValue - value;
    }
}
