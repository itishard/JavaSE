import java.util.Scanner;


public class Main {


    //1.判断素数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int i = 2;

        //1.普通方法
        // for ( i = 2;i<x;i++) {
        //     if (x % i == 0) {
        //         System.out.println("这不是素数");
        //         break;
        //     }
        // }
        // if (i >= x) {
        //     System.out.println("这是素数");
        // }

        //2. 在[2，sqrt(x)]之间存在

        while (i <= Math.sqrt(x)) {
            if (x % i == 0) {
                System.out.println(x +"不是素数");
                return;
            }
            i++;
        }
        System.out.println(x + "是素数");
    }



    //2.打印1-100之间的所有素数
    public static void main2(String[] args) {
        int j = 1;
        for (int i = 2;i<=100;i++) {
            for ( j = 2;j<i;j++) {
                if (i % j == 0) {
                   break;
                }
            }
            if (j==i) {
                System.out.println(i);
            }
        }
    }
    //3.输出 1000 - 2000 之间所有的闰年
    public static void main3(String[] args) {
        int i = 1000;
        for (;i<=2000;i++) {
            if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0)) {
<<<<<<< HEAD
=======
                System.out.println(i);
            } else if (i % 4 == 0) {
>>>>>>> a6a452fd0e69bc92bb6405408c992e652d21b674
                System.out.println(i);
            }
        }
    }
    //4.编写程序数一下 1到 100 的所有整数中出现多少个数字9
    public static void main4(String[] args) {
        int i = 1;
        int count = 0;
        for (i = 1;i<=100;i++) {
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