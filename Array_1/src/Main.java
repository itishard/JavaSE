import java.util.Arrays;

public class Main {
    public static void main1(String[] args) {
        // 数组定义：一块连续的内存 存储相同类型的数据
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = new int[]{1, 2, 3, 4};
        // System.out.println(arr[13]);
        int arr5[] = null;

        // 计算长度
        int len = arr.length;
        int[] arr4 = null;// 变量当中存储地址 arr4为引用变量
        int[] arr3 = new int[10];// 默认数组初始化 分配了10个单位  默认初始化为0

    }


    public static void main2(String[] args) {
        int[] array = {1, 2, 31, 14};
        String arr = Arrays.toString(array);
        System.out.println(arr);
        Arrays.sort(array, 0, 4);// 对【0，4）的下标数值排序
        System.out.println(Arrays.toString(array));
    }

    // 遍历数组
    public static void main3(String[] args) {
        int[] array = {1, 2, 3, 4};
        //方式一
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        //方式二： for-each
        for (int x:array) {
            System.out.println(x + " ");
        }
    }

    //数组空指针异常
    public static void main4(String[] args) {
        int[] array = null;
        System.out.println(array.length);
    }

    //数组作为函数
    public static void main5(String[] args) {
        int[] array = {1,2,3,4};
        func1(array);
        func2(array);
    }

    public static void func1(int[] array) {
        array[0] = 99;
    }

    public static void func2(int[] array) {
        array = new int[]{11,22,33,44,55};
    }

    //数组作为返回值传递
    public static void main6(String[] args) {

        int[] ret = func3();
        for (int x:func3()) {
            System.out.println(x+" ");
        }
    }
    public static int[] func3() {
        int[] ret = new int[2];
        ret[0] = 99;
        ret[1] = 100;
        return ret;
    }

    //数组转为字符串
    public static void main7(String[] args) {
        int[] array = {1,21,13,45};
        System.out.println(Arrays.toString(array));
        //数组按大小排序
        Arrays.sort(array,0,array.length);//左闭右开 [0,4)
        System.out.println(Arrays.toString(array));

        //自制mytoSting
        mytoString(array);
    }
    public static String mytoString(int[] array) {
        if (array == null) {
            return "null";
        }
        if (array.length == 0) {
            return "[]";
        }

        String ret = "[";
        for (int i = 0;i<array.length;i++) {
            ret += array[i];
            if (i<array.length-1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }





}