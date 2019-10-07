package com.example.generics;

public class NumberPrinter<T> {

    public void print(T data) {

        if(data instanceof Integer) {

            System.out.println(data);
        }
    }
}
