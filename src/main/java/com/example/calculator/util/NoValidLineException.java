package com.example.calculator.util;

public class NoValidLineException extends Exception {

    public NoValidLineException() {
        System.out.println("Bad format line");
    }
}
