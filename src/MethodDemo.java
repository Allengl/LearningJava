public class MethodDemo {
    public static void main(String[] args) {
        // method
        String s = "Hello, World!";
        doHomeWork(s);

        int result = add(1, 2);
        System.out.println("result = " + result);
    }

    static void doHomeWork(String name) {
        System.out.println("do homework" + name);
    }

    // method
    void sayHello(int times, String name) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello, " + name);
        }
    }

    // method
    static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    // method canWork
    boolean canWork(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // 写一个成绩评定方法
    // 90-100: A
    // 80-89: B
    // 70-79: C
    // 60-69: D
    static char getGrade(int score) {
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        return grade;
    }

}
