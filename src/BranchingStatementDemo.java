import static java.lang.Integer.sum;

public class BranchingStatementDemo {
    public static void main(String[] args) {
        // break
        for (int a = 0; a < 10; a++) {
            if (a == 5) {
                break;
            }
            System.out.println("a = " + a);
        }
        // continue
        for (int b = 0; b < 10; b++) {
            if (b == 5) {
                continue;
            }
            System.out.println("b = " + b);
        }
        // return
        int c = 10;
        int d = 20;
        int e = sum(c, d);
        System.out.println("e = " + e);
    }


}
