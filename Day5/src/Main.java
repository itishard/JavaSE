
public class Main {

    //使用方法判断闰年
    public static boolean isLeapYear(int year) {
        if ( (year % 4 ==0 && year % 100 != 0) || (year % 400 == 0) ) {
            System.out.println("YES");
            return true;
        } else {
            System.out.println("NO");
            return false;
        }
    }


    public static void main1(String[] args) {
        int Year = 2020;
        isLeapYear(Year);
    }

    //阶乘实现
    public static int func(int n) {
        int sum = 1;
        int sum1 = 0;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i; j++) {
                sum *= j;
            }
            sum1 += sum;
            sum = 1;
        }
        return sum1;
    }

    public static void main2(String[] args) {
        int n = 5;
        int ret = func(n);
        System.out.println(ret);
    }

    //方法重载 :个数 类型 顺序
    public static int add(int a ,int b) {
        return a+b;
    }
    public static double add(double a ,int b) {
        return a+b;
    }

    public static void main(String[] args) {
        int x =1;
        int y =2;
        System.out.println(add(x, y));
    }

}