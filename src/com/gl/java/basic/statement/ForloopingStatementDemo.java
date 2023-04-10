package com.gl.java.basic.statement;

public class ForloopingStatementDemo {
    public static void main(String[] args) {
        // 打印10次Hello World
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }

        // 打印 hello world 10次, 初始化i从20开始, i = i + 5
        for (int i = 50; i < 100; i = i + 5) {
            System.out.println("Hello World" + i);
        }

        // 计算求和: 1 + 2 + 3 + ... + 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        // 判断一个数是否是素数
        int num = 13;
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
    }
}
