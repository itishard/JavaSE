public class Tested {
    public static int num = 10;

    public int num1 = 20;
    {
        //一般情况下用来初始化非静态的数据成员
        System.out.println("实例代码块被执行了");

        num1 = 30;
    }

    static {
        System.out.println("静态代码块被执行了");
        num = 100;
    }

    public static void main(String[] args) {
        Tested tested = new Tested();
        System.out.println(Tested.num);
        System.out.println(tested.num1);
    }
}
