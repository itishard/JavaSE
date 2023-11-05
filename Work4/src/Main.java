import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Random;
import java.util.Scanner;

public class Main {
    //控制台输入与输出
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入整数
        System.out.println("输入整数");
        int age = scanner.nextInt();
        System.out.println("输入字符串");
        String name = scanner.nextLine();
        System.out.println(name);
        String name1 = scanner.next();
        System.out.println(name1);

        //循环输入输出
        while (scanner.hasNextLine()) {
            String x = scanner.nextLine();
            System.out.println(x);
        }
        //退出循环 ---> ctrl + D
    }

    //猜数字游戏
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int Num = random.nextInt(100);
        int count = 0;
        while (count < 3) {
            System.out.println("请输入你所猜的数字");
            int num =scanner.nextInt();
            if (num > Num){
                count++;
                System.out.println("猜大了");
            } else if (num == Num) {
                System.out.println("猜对了");
                break;
            }else {
                count++;
                System.out.println("猜小了");
            }
        }
        if (count == 3) {
            System.out.println("使用次数："+count);
        }
    }

    //输出乘法口诀
    public static void main3(String[] args) {
        int n = 9;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j + "="+i*j+" ");
                if (i == j) {
                    System.out.println();
                }
            }
        }
    }

    //求两个数最大公约数
    public static void main4(String[] args) {
        int a = 24;
        int b = 16;
        while (a % b != 0) {
            int tmp = a;
             a = b;
             b = tmp % a;

        }
        System.out.println(b);
    }

    //水仙花数
    public static void main5(String[] args) {
        for (int i=153;i<=999999;i++){
            int count = 0;
            int tmp = i;
            while (tmp %10 != 0) {
                count++;
                tmp = tmp / 10;
            }

             tmp = i;
            int sum = 0;
            while (tmp != 0){
                sum += Math.pow(tmp%10,count);
                tmp /= 10;
            }
            if (sum == i) {
                System.out.println(i);

            }
        }
    }

    //求一个数二进制中1的个数
    public static void main6(String[] args) {

        int n = 7;
        int count = 0;

        /*
        while (n != 0) {
            count++;
            n = n & (n-1);
        }
        System.out.println(count);
    }
    */

        //方法2
        while (n != 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >>> 1;
        }
        System.out.println(count);
    }



    //获取一个数二进制奇数位和偶数位
    public static void main7(String[] args) {
        int n = 7;
        for (int i = 30; i >= 0; i-=2) {
            System.out.print(((n >> i) & 1) + " ");

        }
        System.out.println();
        for (int j = 31; j >=1 ; j-=2) {
            System.out.print(((n >> j) & 1) + " ");

        }
    }

    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
    public static void main8(String[] args) {
        int n = 100;
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(-1,i+1) * (1.0/i);
        }
        System.out.println(sum);
    }

    //输出整数的每一位
    public static void main9(String[] args) {
        int n =123;
        while (n != 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }

    //模拟三次密码输入的场景。 最多能输入三次密码
    public static void main10(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 123;
        int count = 0;
        while (scanner.hasNextInt()) {
            int ret = scanner.nextInt();
            count++;
            if (ret == 123) {
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("登陆失败");
            }
            if (count == 3) {
                System.out.println("程序结束");
                return;
            }
        }
    }



    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    //要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    public static int max2(int a,int b) {
        return a>b?a:b;
    }

    public static int max3(int a ,int b,int c){
        int max = max2(a,b);
        if (max > c){
            return max;
        }else {
            return c;
        }
    }
    public static void main11(String[] args) {
        int a = 1;
        int b =2 ;
        int c = 3;
        int Max = max3(a,b,c);
        System.out.println(Max);
    }

    //求斐波那契数列的第n项。(迭代实现)
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tmp = 0;
        for (int i = 3;i<=n;i++){
            tmp = a+b;
            a = b;
            b = tmp;
        }
        System.out.println(b);

    }

    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
    public static int add(int a,int b) {
        return a+b;
    }
    public static double add(double c,double d,double e) {
        return c+d+e;
    }
    public static void main13(String[] args) {
        int a = 1;
        int b = 2;
        double c = 1.2;
        double d = 3.4;
        double e = 5.6;
        System.out.println(add(a, b));
        System.out.println(add(c, d, e));
    }

    //在同一个类中定义多个方法：要求不仅可以求2个整数的最大值，还可以求3个小数的最大值？
    public  static int max(int a,int b) {
        return a>b?a:b;
    }
    public  static double max(double a,double b) {
        return a>b?a:b;
    }
    public static double max(double c,double d,double e) {
        double ret = max(c,d);
        return ret>e?ret:e;
    }

    public static void main14(String[] args) {
        int a = 1;
        int b = 2;
        double c = 1.2;
        double d = 3.4;
        double e = 5.6;
        System.out.println(max(a, b));
        System.out.println(max(c,d,e));
    }


}