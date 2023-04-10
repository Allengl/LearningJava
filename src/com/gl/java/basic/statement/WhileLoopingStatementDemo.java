package com.gl.java.basic.statement;

public class WhileLoopingStatementDemo {
    public static void main(String[] args) {
        // while
        int a = 0;
        while (a < 10) {
            System.out.println("a = " + a);
            a++;
        }
        // do-while
        int b = 0;
        do {
            System.out.println("b = " + b);
            b++;
        } while (b < 10);
        // for
        for (int c = 0; c < 10; c++) {
            System.out.println("c = " + c);
        }
        // for
        for (int d = 0; d < 10; d++) {
            if (d == 5) {
                break;
            }
            System.out.println("d = " + d);
        }

    }
}
