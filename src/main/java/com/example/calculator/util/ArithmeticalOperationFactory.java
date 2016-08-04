package com.example.calculator.util;

import com.example.calculator.operation.*;

public class ArithmeticalOperationFactory {
    public BaseOperation constructOperation(String operationName, int value) {

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
