public class Main {

    // 递归
    // 1.求n的阶乘
    public static void main1(String[] args) {
        int n = 5;
        System.out.println(func1(n));
    }

    public static int func1(int a) {

        if (a == 1) {
            return 1;
        }
        int sum = a * func1(a - 1);
        return sum;
    }

    // 2.按顺序打印数字每一位 1234打印1 2 3 4
    public static void main2(String[] args) {
        int n = 1234;
        func2(n);
    }

    public static void func2(int n) {
        if (n / 10 == 0) {
            System.out.print(n);
            return;
        }
        func2(n / 10);
        int tmp = n % 10;
        System.out.print(" " + tmp + " ");
    }

    // 3.求1-n之间的和
    public static void main3(String[] args) {
        int n = 10;
        System.out.println(func3(n));

    }

    public static int func3(int n) {
        if (n == 1) {
            return 1;
        }
        return n + func3(n - 1);
    }

    // 4.计算1729各数字之和
    public static void main4(String[] args) {
        int n = 1729;
        System.out.println(func4(n));
    }

    public static int func4(int n) {
        if (n / 10 == 0) {
            return n;
        }
        return n % 10 + func4(n / 10);

    }

    // 5.斐波那契数列

    // 方法一：递归
    public static void main5(String[] args) {
        int n = 5;
        System.out.println(func5(n));
    }

    public static int func5(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 1;
        }
        return func5(n - 1) + func5(n - 2);
    }

    // 方法二：循环
    public static void main(String[] args) {
        int n = 5;
        System.out.println(func6(n));
    }

    public static int func6(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}