package com.example.calculator.util;

import com.example.calculator.operation.*;

public class ArithmeticalOperationFactory {
    public BaseOperation constructOperation(String[] operation) {
        String operationName = operation[0];
        int value = Integer.valueOf(operation[1]);
        if ("apply".equals(operationName)) {
            return new InitialOperation(value);
        }
        if ("add".equals(operationName)) {
            return new AddOperation(value);
        }
        if ("multiply".equals(operationName)) {
            return new MultiplyOperation(value);
        }
        if ("divided".equals(operationName)) {
            return new DividedOperation(value);
        }
        if ("deduct".equals(operationName)) {
            return new DeductOperation(value);
        }

        throw new IllegalArgumentException("wrong operation name " + operationName);
    }
}
