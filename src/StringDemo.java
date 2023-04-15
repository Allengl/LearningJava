public class StringDemo {
    public static void main(String[] args) {
        // 1. 创建字符串
        // 双引号 最常用的办法
        String s1 = "Hello";
        // new 构造器
        String s2 = new String("Hello");
        // 通过字符数组创建字符串
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String s3 = new String(chars);
        // StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        String s4 = sb.toString();
        // StringBuffer
        StringBuffer sb2 = new StringBuffer("Hello");
        sb2.append(" World");
        String s5 = sb2.toString();

        // 2. 获取字符串的长度
        int length = s1.length();
        System.out.println("length = " + length);

        // 3. 获取字符串中的某个字符
        // index 取值范围: [0, length - 1] 不要越界
        char c = s1.charAt(0);
        System.out.println("c = " + c);

        // 4. 遍历字符串
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }

        // 5. 字符串连接
        // 用+号连接
        String s6 = "Hello" + " World";
        // concat方法
        String s7 = "Hello".concat(" World");
        String s8 = "Hello".concat(" World").concat("!");

        // 6. 格式化字符串
        // %s: 字符串 ,%d: 整数 ,%f: 浮点数 ,%c: 字符 ,%b: 布尔值
        String s9 = String.format("Hello %s", "World");
        String s10 = String.format("Hello %s, %d", "World", 100);
        String s11 = String.format("Hello %s, %d, %f", "World", 100, 3.14);
        String s12 = String.format("Hello %s, %d, %f, %c, %b", "World", 100, 3.14, 'A', true);
        System.out.printf("s9 = %s", s9);

        // 7. 字符串与数字类型相互转化
        // 字符串转数字 用包装类的parseXXX方法
        String s13 = "100";
        int i = Integer.parseInt(s13);
        double d = Double.parseDouble(s13);
        System.out.printf("i = %d, d = %f", i, d);
        // 数字转字符串
        String s14 = 100 + "";
        String s15 = String.valueOf(100);
        String s16 = String.valueOf(3.14);

        // 8. 其它常见字符串操作函数
        // 1) 字符串比较
        String s17 = "Hello";
        System.out.println(s17.equals("Hello")); // true
        System.out.println(s17.equals("hello")); // false
        System.out.println(s17.equalsIgnoreCase("hello")); // true
        // 2) 字符串查找
        String s18 = "Hello World";
        System.out.println(s18.contains("World")); // true
        System.out.println(s18.contains("world")); // false
        System.out.println(s18.startsWith("Hello")); // true
        System.out.println(s18.startsWith("hello")); // false
        System.out.println(s18.endsWith("World")); // true
        System.out.println(s18.endsWith("world")); // false
        // 3) 字符串查找
        String s19 = "Hello World";
        System.out.println(s19.indexOf("o")); // 4
        System.out.println(s19.indexOf("o", 5)); // 7
        System.out.println(s19.lastIndexOf("o")); // 7
        System.out.println(s19.lastIndexOf("o", 6)); // 4
        // 4) 字符串替换
        String s20 = "Hello World";
        System.out.println(s20.replace("o", "a")); // Hella Warld
        System.out.println(s20.replaceFirst("o", "a")); // Hella World
        // 5) 字符串分割
        String s21 = "Hello World";
        String[] parts = s21.split(" ");
        for (String part : parts) {
            System.out.println(part);
        }
        // 6) 字符串截取
        String s22 = "Hello World";
        System.out.println(s22.substring(6)); // World
        System.out.println(s22.substring(6, 11)); // World
        // 7) 字符串去除空格
        String s23 = " Hello World ";
    }
}
