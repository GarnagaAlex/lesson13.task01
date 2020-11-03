package com.garnagaaa.lesson13.task01.app1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    // Демонстрация OutOfMemoryError: Java heap space
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        for (long i = 0; i < Long.MAX_VALUE; i++) {
            list.add( i);
            if (i % 1000 == 0) {
                list.remove(0);
            }
        }
    }
}
