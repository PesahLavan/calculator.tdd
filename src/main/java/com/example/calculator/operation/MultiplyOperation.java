package com.example.calculator.operation;

public class MultiplyOperation implements BaseOperation {
    private final int value;

    public MultiplyOperation(int value) {
        this.value = value;
    }

    @Override
    public int apply(int prevValue) {
        return prevValue * value;
    }

}
