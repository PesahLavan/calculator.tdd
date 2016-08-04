package com.example.calculator.operation;

public class AddOperation implements BaseOperation {

    private final int value;

    public AddOperation(int value) {
        this.value = value;
    }

    @Override
    public int apply(int prevValue) {
        return prevValue + value;
    }

}
