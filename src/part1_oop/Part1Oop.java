package part1_oop;

// Part 1. Classes and objects

// 1.1. Class declaration
class MyClass {
}

// 1.2. Public method
class MyClassWithMethod {
    public void print(String s) {
        System.out.println("print: " + s);
    }
}

// 1.3. Private method
class MyClassPrivate {
    private void secret() {
        System.out.println("secret method");
    }

    // call private from inside - ok
    public void callSecret() {
        secret();
    }
}

// 1.4. Constructor
class MyClassConstructor {
    MyClassConstructor() {
        System.out.println("constructor called");
    }
}

// 1.5. Public props
class PublicProps {
    public int num = 10;
    public double price = 9.99;
    public boolean flag = true;
    public String name = "Bob";
    public char letter = 'A';

    // access inside class
    public void show() {
        System.out.println("inside: " + num + ", " + price + ", " + flag + ", " + name + ", " + letter);
    }
}

// 1.6. Private props
class PrivateProps {
    private int age = 20;
    private String city = "Kyiv";

    // access inside class
    public void show() {
        System.out.println("inside: age=" + age + ", city=" + city);
    }
}

// 1.7. Getters/setters
class Person {
    private int age;
    private double height;
    private boolean student;
    private String name;

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public boolean isStudent() { return student; }
    public void setStudent(boolean student) { this.student = student; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

// 1.8. Constructor with args
class Car {
    private String model;
    private int year;

    Car(String model) {
        this.model = model;
        this.year = 2000; // default
    }

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void info() {
        System.out.println("Car: " + model + ", " + year);
    }
}

public class Part1Oop {
    public static void main(String[] args) {
        // 1.1 Object creation
        System.out.println("--- 1.1 ---");
        MyClass obj = new MyClass();
        System.out.println("obj created: " + obj);

        // 1.2 Public method call
        System.out.println("--- 1.2 ---");
        MyClassWithMethod obj2 = new MyClassWithMethod();
        obj2.print("print it");

        // 1.3 Private method
        System.out.println("--- 1.3 ---");
        MyClassPrivate obj3 = new MyClassPrivate();
        obj3.callSecret();
        // obj3.secret(); // error: secret() has private access - uncomment for screenshot

        // 1.4 Constructor
        System.out.println("--- 1.4 ---");
        MyClassConstructor obj4 = new MyClassConstructor();

        // 1.5 Public props
        System.out.println("--- 1.5 ---");
        PublicProps obj5 = new PublicProps();
        System.out.println("outside: " + obj5.num + ", " + obj5.price + ", " + obj5.flag + ", " + obj5.name + ", " + obj5.letter);
        obj5.num = 99;
        obj5.name = "Alice";
        obj5.show();

        // 1.6 Private props
        System.out.println("--- 1.6 ---");
        PrivateProps obj6 = new PrivateProps();
        obj6.show();
        // System.out.println(obj6.age); // error: age has private access - uncomment for screenshot

        // 1.7 Getters/setters
        System.out.println("--- 1.7 ---");
        Person p = new Person();
        p.setAge(19);
        p.setHeight(1.82);
        p.setStudent(true);
        p.setName("Max");
        System.out.println(p.getName() + ", " + p.getAge() + ", " + p.getHeight() + ", student=" + p.isStudent());

        // 1.8 Constructor with args
        System.out.println("--- 1.8 ---");
        Car c1 = new Car("Toyota");
        Car c2 = new Car("BMW", 2020);
        c1.info();
        c2.info();
    }
}
