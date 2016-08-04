package com.example.calculator.util;

import com.example.calculator.operation.BaseOperation;
import com.example.calculator.operation.InitialOperation;

import java.util.List;

public class ValidListOperation {

    public boolean validate(List<BaseOperation> list) {
       if (validateApply(list) & applyEnd(list)) return true;
        else return false;
    }
    private boolean validateApply(List<BaseOperation> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof InitialOperation) count++;
        }
        if (count == 1) return true;
        else return false;
    }
    private boolean applyEnd(List<BaseOperation> list) {

        if (list.get(list.size()) instanceof InitialOperation) return true;
        else return false;
    }
}
