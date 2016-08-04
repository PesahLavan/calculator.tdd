package com.example.calculator.util;

import java.util.IllegalFormatException;

public class ValidationLine {

    public ValidationLine() {
    }

    public String[] parse(String calcReade) throws NoValidLineException {
        String[] lineElement = calcReade.split(" ");
        if (isCount(lineElement) & isOperation(lineElement) & isNumber(lineElement))
            return lineElement;
        else  throw new NoValidLineException();
    }
    private boolean isCount(String[] line){
        if (line.length == 2) return true;
        else return false;
    }

    private boolean isOperation(String[] line){
        if (line[0].equals("apply")) return true;
        else if (line[0].equals("add")) return true;
        else if (line[0].equals("multiply")) return true;
        else if (line[0].equals("divided")) return true;
        else if (line[0].equals("deduct")) return true;
        else return false;
    }
    private boolean isNumber(String[] line){
        if (Integer.valueOf(line[1]).equals(IllegalFormatException.class)) return false;
        else return true;
    }
}
