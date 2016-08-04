package com.example.calculator;

public class NoValidLineException extends Exception {

    public NoValidLineException() {
        System.out.println("Bad format line");
    }
}
