import com.sun.java.swing.plaf.windows.WindowsTabbedPaneUI;

import java.util.Arrays;

public class Main {



    public static void main1(String[] args) {

        //数组定义
        int[] array1 = new int[]{1,2,3,4};
        int[] array2 = new int[10];
        int[] array3 = null;
        int[] array = {1,2,3,4};
        //System.out.println(array[10]); //报错：java越界异常
        //获取数组长度
        System.out.println(array.length);
    }

    public static void main2(String[] args) {
        int[] array = {1,2,3,4};
        //遍历数组的方式
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println();
        //for each遍历数组：适用于仅遍历
        for (int x:array) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (double x :
                array) {
            System.out.print(x + " ");
        }
        System.out.println();

        //Arrays.toString:将数组转换成字符串
        System.out.println(Arrays.toString(array));
    }
    //引用变量--数组
    public static void main3(String[] args) {
        //堆栈概念
    }

    public static void print(int[] array){
        for (int x :
                array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main4(String[] args) {
        int[] array = {1,2,3,4};
        print(array);
        // int[] array1 = null;
        // array1[1] = 1;
        // System.out.println(Arrays.toString(array1));
    }

    public static void func1(int[] array){
         array = new int[]{11,22,33,44};
    }
    public static void func2(int[] array){
        array[0] = 11;

    }
    public static void main5(String[] args) {
        int[] array = {1,2,3,4};
        func1(array);
        //func2(array)
        System.out.println(Arrays.toString(array));
    }

    //函数作为返回值 打印斐波那契数列
    public static int[] func3(int n){
        int[] array = new int[10];
        array[0] = array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array;
    }
    public static void main6(String[] args) {
        int n = 10;
        int[] ret =func3(n);
        System.out.println(Arrays.toString(ret));
    }

    //数组转字符串：自制toString--gb版本

    public static String gbtoString(int[] array){
        if (array == null){
            return null;
        }
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if (i<array.length-1){
                ret += ", ";
            }
            if (i == array.length-1){
                ret += "]";
            }
        }
        return ret;
    }
    public static void main7(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println("Java自带toString");
        System.out.println(Arrays.toString(array));
        System.out.println("gb自创toString");
        System.out.println(gbtoString(array));
    }

    //数组拷贝
    public static void main8(String[] args) {
        int[] array = {1,2,3,4};
        //1.基础拷贝
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i]=array[i];
        }
        System.out.println(Arrays.toString(copy));
        //2.copyOf
        int[] copy1 =  Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(copy1));
        //3.拷贝并扩容
        int[] copy2 = Arrays.copyOf(array,array.length*2);
        //4.部分拷贝 左闭右开[from,to)
        int[] copy3 = Arrays.copyOfRange(array,1,3);
        //5.System.arraycopy
        int[] dest = new int[array.length];
        System.arraycopy(array,0,dest,0,array.length);
        System.out.println(Arrays.toString(dest));
        //6.array.clone
        int[] copy4 = array.clone();
        System.out.println(Arrays.toString(copy4));
    }

    //二分查找 ---建立在有序的基础上
    // public static int binarySearch(int[] array,int key){
    //
    // }
    public static void main9(String[] args) {
        int[] array = {1,31,5,6,25};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    //数组逆序
    public static void main10(String[] args) {
        int[] array = {1,2,3,4,5};
        int i = 0;
        int j = array.length-1;
        while (i<j){
            int tmp = array[i];
            array[i]=array[j];
            array[j] = tmp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main11(String[] args) {
        int[] array1 = {1,2,31,5,4};
        int[] array2 = {1,2,31,5,4};
        System.out.println(Arrays.equals(array1, array2));
        int[] array3 = new int[10];
        Arrays.fill(array3,1,3,99);
        System.out.println(Arrays.toString(array3));
    }

    //冒泡排序
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;

                }
            }
        }
    }
    public static void main12(String[] args) {
        int[] array = {1,2,31,4,5};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    //二维数组
    public static void main(String[] args) {
        int[][] array ={{1,2,3},{4,5,6}};
        int[][] array1 = new int[][]{{1,2,3},{4,5,6}};
        int[][] array2 = new int[2][];
        array[0] = new int[5];
        array[1] = new int[3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}