import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Data data = new Data(x, y);
            data.setX(x);
            data.setY(y);
            System.out.println(data.getX() + data.getY());
        }
    }

}

class Data {


    private int x;
    private int y;

    public Data(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}