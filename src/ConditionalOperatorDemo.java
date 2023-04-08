public class ConditionalOperatorDemo {
    public static void main(String[] args) {
        // And
        boolean isTrue = true;
        boolean isFalse = false;
        boolean isTrue2 = isTrue && isTrue; // true
        boolean isFalse2 = isTrue && isFalse; // false
        boolean isFalse3 = isFalse && isFalse; // false

        // Or
        boolean isTrue3 = isTrue || isTrue; // true
        boolean isTrue4 = isTrue || isFalse; // true
        boolean isFalse4 = isFalse || isFalse; // false

        // ?:
        int a = 10;
        int b = 20;
        int c = a > b ? a : b; // 20
        int d = a < b ? a : b; // 10

    }
}
