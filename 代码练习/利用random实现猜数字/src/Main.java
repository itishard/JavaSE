import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();// 根据当前时间生成随机数

        int randNum = random.nextInt(100);// 从random库函数中获取随机值于[0-100）
        System.out.println("本次生成的随机数为： " + randNum);

        Scanner scanner = new Scanner(System.in);// 从键盘获取数值
        Scanner sc = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = sc.nextInt();
        System.out.println("sc是" + num1);
        System.out.println("scanner是" + num);
        System.out.println(num1 + num);

        // while(true) {
        //     int num = scanner.nextInt();
        //     if (num < randNum) {
        //         System.out.println("小了");
        //     } else if (num == randNum) {
        //         System.out.println("恭喜你猜对了");
        //         break;
        //     } else {
        //         System.out.println("大了");
        //     }
        // }


    }
}