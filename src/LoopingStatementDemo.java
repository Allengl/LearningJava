public class LoopingStatementDemo {
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
        // for-each
        int[] arr = {1, 2, 3, 4, 5};
        for (int d : arr) {
            System.out.println("d = " + d);
        }
    }
}
