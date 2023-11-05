import java.util.Arrays;

public class Main {
    public static void main1(String[] args) {
        //fill方法
        int[] array = new int[10];
        Arrays.fill(array,0,3,9);//[0,3)
        System.out.println(Arrays.toString(array));
        //equal
        int[] array2 = new int[]{2,5,6,7};
        System.out.println(Arrays.equals(array2, array));
    }

    //数组的拷贝 扩容
    public static void main2(String[] args) {
        int[] array = new int[]{1,2,3,4};
        int[] copy = Arrays.copyOf(array,array.length *2);
        System.out.println(Arrays.toString(copy));
        //局部拷贝
        int[] copy1 = Arrays.copyOfRange(array,0,3);
        System.out.println(Arrays.toString(copy1));

        int[] copy2 = new int[array.length];
        System.arraycopy(array,0,copy2,0,array.length);
        System.out.println(Arrays.toString(copy2));
    }
    public static void main3(String[] args) {
        //二维数组
        int[][] array2 = {{1,2},{1,2,3}};
        System.out.println(Arrays.toString(array2));//说明储存在二维数组的下标是地址
        int[][] array1 = new int[][]{{1,2},{1,2,3}};

        //int[][] array3 = new int[][3];//报错
        int[][] array3 = new int[2][];//二维数组可以省略列不能省略行 空指针无法获取地址

        System.out.println(array2.length);
        //获取二维数组的数字
        //方法1：
        for (int i = 0;i<array2.length;i++) {
            for (int j = 0;j<array2[i].length;j++) {
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("======================");
        //方法2：
        System.out.println(Arrays.deepToString(array2));
        System.out.println("========================");
        //方法3：for each
        for (int[] tmp :array2) {
            for (int x : tmp) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int[]{1,2,3};
        array[1] = new int[]{5,4};
        System.out.println(Arrays.deepToString(array));
    }





    public static void main6(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] copy = new int[array.length];

        int[] copy1 =Arrays.copyOf(array,array.length*2);//拷贝加二倍扩容
        System.out.println(Arrays.toString(copy1));

        int[] array1 = {1,2,3,4,5,6};
        int[] copy2 = Arrays.copyOfRange(array1,0,3);//范围：[0,3)
        System.out.println(Arrays.toString(copy2));
    }
}