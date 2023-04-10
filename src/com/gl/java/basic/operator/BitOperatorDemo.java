package com.gl.java.basic.operator;

public class BitOperatorDemo {
    public static void main(String[] args) {
        // Bitwise AND
        int a = 10; // 1010
        int b = 20; // 10100
        int c = a & b; // 10100 = 20
        // Bitwise OR
        int d = a | b; // 10110 = 22
        // Bitwise XOR
        int e = a ^ b; // 10010 = 18
        // Bitwise NOT
        int f = ~a; // 11111111111111111111111111110101 = -11

    }
}
