public class Main {

    // 字符串类型
    public static void main1(String[] args) {
        String str = "hello";
        // String类型中直接以字符串最后一个字符作为结尾
        System.out.println(str.length());

        //整数变成字符串
        int p = 100;
        String str2 = String.valueOf(p);
        System.out.println(str2);
        // 字符串的连接
        System.out.println("a = " + str + " " + "p = " + p);

        int a = 10;
        int b = 20;
        System.out.println("a + b" + a + b);
        System.out.println(a + b + "a + b");//加完拼接
        System.out.println("a + b = " + (a + b));

        String str4 = "123";
        int val = Integer.parseInt(str4);
        System.out.println(val);


    }


    // 类型转换
    public static void mainChange(String args[]) {
        // 类型的提升分为自动和强制

        int a = 10;
        long b = 100L;
        // int c = a+b;
        long c2 = a + b;
        b = a;// 自动提升
        a = (int) b;// 强制转换

        float f = 1.2f;
        double d = 3.4;

        f = (float) a;


    }


    // 布尔型  只有true 和 false两种值
    public static void mainBoolean(String[] args) {
        boolean flag = true;
        System.out.println(flag);
    }


    // 字符型(char) ----2个字节
    public static void mainChar(String[] args) {
        char a = 'A';
        char b = '张';
        System.out.println(a);
        System.out.println(b);
        Character x = '陈';
        System.out.println(x);
    }

    // 浮点型
    public static void mainFloat(String[] args) {
        int a = 1;
        int b = 2;
        float x = 1;
        float y = 1.0f;
        System.out.println(a*1.0/b);//类型转换
        double c = 1.2;
        float d = 3.4f;
    }

    // 整型
    public static void mainInt(String[] args) {
        // 各个数据类型范围的讨论
        // byte ;  -128~127
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        // int ;
        System.out.println("int类型变量范围是");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // long a = 10L;//在long整型变量中
        // 通常在long的初始化值后面+L
        System.out.println("long类型变量范围是");
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        // short c; 两个字节
        System.out.println("short类型变量范围是");
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        int a = 1;
        int b = 2;

        System.out.println(1.0 * a / b);// 通过1.0进行数据类型的强 制转换

        float num = 1.0F;
        double g = 1.1;
        System.out.println(g * g);

        boolean flag;// 只有true false      Boolean

        // 类型转换
        int x = 1;
        byte y = (byte) x;
        System.out.println(y);

        byte g1 = 10;
        byte g2 = 20;
        byte g3 = (byte) (g1 + g2);
        int g4 = g1 + g2;// 小于4个字节的类型将提升至4个字节
        System.out.println(g3);

        int s1 = 10;
        int s2 = 20;
        System.out.println("a+b" + s2 + s1);// string作为的是拼接功能
        System.out.println(s1 + s2 + "a+b");


        // 运算符
        System.out.println(10 % 3);
        System.out.println(10 % -3);
        System.out.println(-10 % 3);
        System.out.println(-10 % -3);
        System.out.println(11.5 % 2);
        int c = 1;
        double d = 2.0;
        c += d;//+=会自动进行类型转换
        // a = a+b 报错

        byte x1 = 127;
        byte y2 = 1;
        x1 += y2;
        System.out.println(x1);

        System.out.println(" \\hello\\ ");
        System.out.println("  \"hello\" ");
        System.out.println(" \\\"hello\\\" ");
    }
}