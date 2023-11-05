import java.util.Arrays;

public class Main {

    // 1.方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
    public static void main1(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(Arrays.toString(array));
        transform(array);
        System.out.println(Arrays.toString(array));

    }

    public static void transform(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }

    }

    // 2.奇数位于偶数之前
    public static void main2(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(array));
        func1(array);
        System.out.println(Arrays.toString(array));
    }

    public static void func1(int[] array) {
        int j = array.length - 1;
        int i = 0;
        while (i < j) {
            while (i < j && array[i] % 2 != 0) {
                i++;
            }
            while (i < j && array[j] % 2 == 0) {
                j--;
            }
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }

    // 3.二分查找
    public static void main3(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int key = 7;
        int ret = func2(key, array);
        System.out.println(ret);
    }

    public static int func2(int key, int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (array[mid] > key) {
                right = mid - 1;
            } else if (array[mid] == key) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    // 4.两数之和
    public static void main4(String[] args) {
        int[] array = {2, 7, 11, 15};
        int target = 9;
        int[] ret = func3(target, array);
        System.out.println(Arrays.toString(ret));

    }

    public static int[] func3(int n, int[] array) {
        int[] ret = new int[]{-1, -1};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == n) {
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return ret;
    }

    // 5.只出现一次的数字
    public static void main5(String[] args) {
        int[] array = new int[]{2, 2, 1};
        System.out.println(func5(array));
    }

    public static int func5(int[] array) {
        int i = 0;
        for (; i < array.length; i++) {
            int count = 0;
            for (int j = 0;j<array.length;j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return array[i];
            }
        }
        return -1;
    }
    //6.多数元素
    public static void main6(String[] args) {
        int[] array = new int[]{2,2,1,1,1,2,2};
        System.out.println(func6(array));
    }
    public static int func6(int[] array) {
        Arrays.sort(array);
        return  array[array.length/2];
    }

    //7.存在连续三个奇数的数组
    public static void main(String[] args) {
        int[] array = new int[]{1,2,34,3,4,5,7,23,12};
        System.out.println(func7(array));
    }
    public static boolean func7(int[] array) {
        for (int i = 0;i<array.length;i++) {
            int count = 0;
            for (int j = 0;j<array.length;j++) {
                if (array[j]%2 != 0) {
                    count++;
                    if (count == 3) {
                        return true;
                    }
                }else {
                    count =0;
                }
            }
        }
        return false;
    }
}