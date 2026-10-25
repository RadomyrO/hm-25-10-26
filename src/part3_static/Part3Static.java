package part3_static;

// Part 3. Static

// 3.1. Static var
class Counter {
    static int staticVar = 0;
}

// 3.2. Static method
class MathHelper {
    static int square(int x) {
        return x * x;
    }

    // static from static - ok
    static void printSquare(int x) {
        System.out.println("static->static: " + square(x));
        // hello(); // error: non-static method hello() cannot be referenced from a static context
    }

    // static from non-static - ok
    void hello() {
        System.out.println("non-static->static: " + square(3));
    }
}

public class Part3Static {
    public static void main(String[] args) {
        // 3.1 Static var
        System.out.println("--- 3.1 ---");
        Counter.staticVar = 5;
        System.out.println("Counter.staticVar = " + Counter.staticVar);

        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        obj1.staticVar = 10; // changes for all

        System.out.println("obj1.staticVar = " + obj1.staticVar);
        System.out.println("obj2.staticVar = " + obj2.staticVar);
        System.out.println("equal: " + (obj1.staticVar == obj2.staticVar));

        // 3.2 Static method
        System.out.println("--- 3.2 ---");
        System.out.println("MathHelper.square(4) = " + MathHelper.square(4));
        MathHelper.printSquare(5);
        new MathHelper().hello();
    }
}
