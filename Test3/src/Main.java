import java.util.Scanner;

public class Main {


    // 九九乘法表
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + " ");
                if (i == j) {
                    System.out.println(" ");
                }
            }
        }
    }

    // 模拟登录
    public static void main3(String[] args) {
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

    // 打印X
    public static void main2(String[] args) {

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
    public static void main1(String[] args) {
        int i = 1;
        float sum = 1.0f;
        for (i = 1; i <= 100; i++) {
            sum += Math.pow(-1, i - 1) * 1 / i;
        }
        System.out.println(sum);
    }
}