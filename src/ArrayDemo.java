public class ArrayDemo {
    public static void main(String[] args) {
        // 1. 如何创建一个数组
        int[] numberArray = new int[10]; // 推荐写法
        //不推荐写法
        int[] nums;
        nums = new int[10];

        char charArray[] = new char[10];
        boolean[] boolArray = new boolean[10];
        float[] floatsArray = new float[10];
        String[] stringArray = new String[10];
        ArrayDemo[] arrayDemoArray = new ArrayDemo[0]; //没有意义
        Integer[] integerArray = new Integer[10];

        // 2. 如何初始化一个数组
        // 静态初始化
        int[] scores = {100, 99, 66};
        boolean[] bools = {true, false, true};
        String[] names = {"Alice", "Bob", "Cindy"};
        // 动态初始化
        // index为0的位置 -> 赋值
        numberArray[0] = 100; //int 语句赋值
        numberArray[1] = 99;
        //index不能越界: index是有范围的，max-index = array.length - 1
        numberArray[10] = 100; // ArrayIndexOutOfBoundsException
        // 3. 如何访问数组中某个位置的元素
        System.out.println(numberArray[0]);
        System.out.println(numberArray[1]);
        System.out.println(scores[2]);
        System.out.println(names[0]);
        // 4. 如何获取数组长度
        System.out.println(numberArray.length);
        System.out.println(scores.length);
        System.out.println(names.length);
        // 5. 如何遍历数组
        // for循环 (重点常用)
        // index [0, numberArray.length - 1]
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }
        // for each循环
        for (int score : scores) {
            System.out.println(score);
        }
        // while循环
        int i = 0;
        while (i < numberArray.length) {
            System.out.println(numberArray[i]);
            i++;
        }
    }

}
