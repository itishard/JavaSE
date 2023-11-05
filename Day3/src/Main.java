import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        switch (x) {
            case 10:
                System.out.println(1);
            case 2:
                System.out.println(2);

        }
    }

    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in );

        //获取整数
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            System.out.println(a);
        }

        //获取字符串
        //ctrl + d 退出本轮循环
        while (scanner.hasNextLine()) {
            String b = scanner.nextLine();
            System.out.println(b);
        }
    }

    //从控制台获取输入和输出
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine(); //输出字符串
        String name1 = scanner.next();//消除字符串的回车

        //nextInt
        //next 不能获取空格之后的字符串

        Scanner scanner1 = new Scanner(System.in);

    }



    // 分支结构

    // switch
    public static void mainSwitch(String[] args) {
        int a = 10;
        switch (a) {
            case 1:
                break;
            case 2:
                break;
            case 10:
                System.out.println(a);
                break;
            default:
                break;
        }
    }

    // while循环
    public static void mainWhile(String[] args) {
        int i = 0;
        while (i<100){
            i++;
        }
        System.out.println(i);
    }

    //beak continue
    
    //for循环

    //do while循环





}