package com.gl.java.basic.statement;

import java.sql.SQLOutput;

public class IfStatementDemo {
    public static void main(String[] args) {
        // if-then
        int a = 10;
        int b = 20;
        if (a < b) {
            System.out.println("a < b");
        }
        // if-then-else
        if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a <= b");
        }
        // if-then-else-if
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b){
            System.out.println("a < b");
        } else{
            System.out.println("a == b");
        }
        // switch
        int c = 1;
        switch (c) {
            case 1:
                System.out.println("c == 1");
                break;
            case 2:
                System.out.println("c == 2");
                break;
            default:
                System.out.println("c != 1 and c != 2");
        }
    }
}
