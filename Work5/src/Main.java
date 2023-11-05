
public class Main {

    //递归求阶乘
    public static int fac(int n) {
        if (n == 1) {
            return 1;
        }
        int t = n *fac(n-1);
        return t;
    }
    public static void main1(String[] args) {
        int n = 3;
        System.out.println(fac(3));
    }






    //递归求 1 + 2 + 3 + ... + 10
    public static int sum(int n){

        if (n ==1) {
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main2(String[] args) {
        int n = 10;
        System.out.println(sum(10));
    }

    //按顺序打印数字每一位（1234打印1、2、3、4）
    public static void print(int n) {
        if (n / 10 == 0) {
            System.out.println(n%10);
            return;
        }
        print(n/10);
        System.out.println(n % 10);
        return;
    }
    public static void main3(String[] args) {
        int n = 123;
        print(n);
    }

    //整数上的各位数相加
    public static int add(int n){
        if (n / 10 == 0){
            return n;
        }
        int t = n % 10;
        return t+add(n / 10);
    }
    public static void main4(String[] args) {
        int n = 1729;
        System.out.println(add(n));
    }

    //求斐波那契数列第N项

    public static int fib(int n) {
        if (n == 1 || n ==2 ){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main5(String[] args) {
        int n = 5;
        System.out.println(fib(5));
    }

    //递归求解汉诺塔问题
    public static void hanio(int n , char pos1 , char pos2,char pos3){
        if (n == 1){
            move(pos1,pos3);
            return;
        }
        hanio(n-1,pos1,pos3,pos2);
        move(pos1,pos3);
        hanio(n-1,pos2,pos1,pos3);



    }

    public static void move(char pos1,char pos2){
        System.out.println(pos1 +"->"+pos2);
        return;
    }
    public static void main(String[] args) {
        int n = 2;
        hanio(2,'A','B','C');

    }
}