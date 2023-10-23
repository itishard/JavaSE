import java.util.Scanner;

public class Main {

    // 水仙花数
    public static void main9(String[] args) {
        // 方法一
        //     int n = 999;
        //     for (int i = 0; i <= n; i++) {
        //         int Gw = i % 10;
        //         int Sw = (i / 10) % 10;
        //         int Bw = i / 100;
        //         int sum = (int) (Math.pow(Gw, 3) + Math.pow(Sw, 3) + Math.pow(Bw, 3));
        //         if (sum == i) {
        //             System.out.println(i);
        //         } else {
        //             continue;
        //         }
        //     }
        // }

        // 计算到999999的水仙花数
        for (int i = 0; i < 999999; i++) {
            // 计算位数count
            int count = 0;
            int tmp = i;
            while (tmp != 0) {
                count++;
                tmp = tmp / 10;
            }

            tmp = i;
            int sum = 0;
            while (tmp != 0) {
                sum += Math.pow(tmp % 10, count);
                tmp = tmp / 10;
            }
            if (sum == i) {
                System.out.println(i);
            } else {
                continue;
            }
        }
    }

    // 九九乘法表
    public static void main8(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + " ");
                if (i == j) {
                    System.out.println();
                }
            }
        }
    }


    // 模拟登录
    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 3) {
            System.out.println("请输入你的密码:");
            String pass = scanner.nextLine();
            if (pass.equals("123")) {
                System.out.println("密码正确！");
                break;
            } else {
                System.out.println("密码错误！");
                count++;
            }
        }
        if (count > 3) {
            System.out.println("你没有机会了");
        }
    }

    // 打印大X
    public static void main6(String[] args) {

        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    if (i == j || i + j == a - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }
    }

    // 计算1-1/2+1/3-1/4···+1/99-1/100
    public static void main5(String[] args) {
        int i = 1;
        float sum = 1.0f;
        for (i = 1; i <= 100; i++) {
            sum += Math.pow(-1, i - 1) * 1 / i;
        }
        System.out.println(sum);
    }

    // 求最大公约数
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner1.nextInt();
        if (a < b) {
            // 保持a始终大于b
            int t = a;
            a = b;
            b = t;
        }
        int c = a % b;
        while (c != 0) {
            a = b;
            b = c;
            c = a % b;
        }
        System.out.println(b);
    }


    // 获取1-100之间的素数
    public static void main3(String[] args) {
        int n = 100;
        for (int i = 1; i <= n; i++) {
            int j = 2;
            for (; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    // System.out.println(i+"不是素数");
                    break;
                }
            }
            if (j > Math.sqrt(i)) {
                System.out.println(i + "是素数");
            }
        }
    }

    // 判断素数
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("这不是一个素数");
                break;
            } else {
                if (i == n - 1) {
                    System.out.println("这是一个素数");
                }
                continue;
            }
        }
    }

    // 1-100之间数字9将会出现几次
    public static void main1(String[] args) {
        int n = 100;
        int i = 1;
        int count = 0;

        for (i = 1; i < 101; i++) {
            if (i % 10 == 9) {
                count++;
            }
            if (i / 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }
}