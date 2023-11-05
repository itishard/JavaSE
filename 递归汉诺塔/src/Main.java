import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        hanio(n,'A','B','C');
    }
    public static void move(char pos1,char pos2) {
        System.out.println(pos1 +"=>"+pos2);
    }
    public static void hanio(int n ,char pos1,char pos2,char pos3) {
        if (n == 1) {
            move(pos1,pos3);
            return;
        }
        hanio(n-1,pos1,pos3,pos2);
        move(pos1,pos3);
        hanio(n-1,pos2,pos1,pos3);
    }

}