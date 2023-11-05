import java.util.Scanner;

public class Main {
    //
    public static void main(String[] args) {

    }

    // 找到1-100之间 既能被3整除 又能被5整除的数据
    public static void main2(String[] args) {
        int i = 1;
        while (i < 100) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println(i);
                    i++;
                } else {
                    i++;
                }
            } else {
                i++;
            }

        }
    }

    // 计算阶乘
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 1;
        while (n > 0) {
            sum = sum * n;
            n--;
        }
        System.out.println(sum);
    }
}