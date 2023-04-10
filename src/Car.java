public class Car {

    // 属性/字段/状态/成员变量（静态数据）fields
    private String name;
    private String color;
    private int speed;
    private int gear;

    // 构造器: 用于初始化对象的属性
    // 构造方法（构造器）constructor  无参构造器
    public Car() {
        this.name = "BMW";
        this.color = "Black";
        this.speed = 0;
        this.gear = 1;
    }
    // 构造方法（构造器）constructor  有参构造器
    public Car(String name, String color, int speed, int gear) {
        this.name = name;
        this.color = color;
        this.speed = speed;
        this.gear = gear;
    }

    // 行为（动态行为）method
    public void speedUp(int speed) {
        this.speed += speed;
    }

    public void speedDown(int speed) {
        this.speed -= speed;
    }

    public void changeGear(int gear) {
        this.gear = gear;
    }

    public void printStatus() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
        System.out.println("Gear: " + gear);
    }

    public static void main(String[] args) {
        // 创建对象(最常用，最简单的方法) new
        Car car = new Car("BMW", "Black", 0, 1);
        // 调用方法
        car.printStatus();
        car.speedUp(100);
        car.changeGear(2);
        car.printStatus();
        // 访问属性
        System.out.println(car.name);
        System.out.println(car.color);
        System.out.println(car.speed);
        System.out.println(car.gear);
    }
}
