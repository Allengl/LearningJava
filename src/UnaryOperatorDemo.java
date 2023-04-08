public class UnaryOperatorDemo {
    public static void main(String[] args) {
        // + and - are unary operators
        int count = 100;
        int num = +count;   // 100
        int num2 = -count; // -100

        // ++ and -- are unary operators
        int a = 10;
        int b = 20;
        a++; // a = a + 1
        a--; // a = a - 1
        ++b; // b = b + 1
        --b; // b = b - 1
        int c = a++; // c = 10, a = 11
        int d = ++b; // d = 21, b = 21
        int e = a--; // e = 11, a = 10
        int f = --b; // f = 20, b = 20

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        // ! is a unary operator
        boolean isTrue = true;
        boolean isFalse = false;
        boolean isTrue2 = !isFalse;
        boolean isFalse2 = !isTrue;
        System.out.println(isTrue2);
        System.out.println(isFalse2);
    }
}
