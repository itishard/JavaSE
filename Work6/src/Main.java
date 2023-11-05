import java.util.Arrays;

public class Main {
    //数组转字符串：自制toString ——cyp版本
    public static void myToString(int[] array){

        if (array == null){
            System.out.println("null");
        }
        for (int i = 0; i < array.length; i++) {
            if (i == 0){
                System.out.print("[");
            }
            System.out.print(array[i]);
            if (i < array.length-1){
                System.out.print(", ");
            }
            if (i == array.length-1){
                System.out.print("]");
            }
        }

    }
    public static void main1(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println("Java自带toString");
        System.out.println(Arrays.toString(array));
        System.out.println("自创toString");
        myToString(array);
    }

    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100

    public static void main2(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }

    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
    // 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
    public static void transform(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }
    public static void main3(String[] args) {
        int[] array = {1,2,3};
        transform(array);
        System.out.println(Arrays.toString(array));
    }

    //实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
    public static int sum(int[] array){
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
        }
        return ret;
    }
    public static void main4(String[] args) {
        int[] array = {1,2,3,4};
        int ret = sum(array);
        System.out.println(ret);
    }

    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    //
    // 如数组：[1,2,3,4,5,6]
    //
    // 调整后可能是：[1, 5, 3, 4, 2, 6]


    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length-1-i; j >=0 ; j--) {
                if (array[i] % 2 != 0 && array[j] % 2 == 0){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
    public static void main5(String[] args) {
        int[] array = {1,2,3,4,5,6};
        sort(array);
        System.out.println(Arrays.toString(array));
    }


    //给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，
    // 并返回它们的数组下标
    // 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
    // 你可以按任意顺序返回答案。
    // 输入：nums = [2,7,11,15], target = 9
    // 输出：[0,1]
    // 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

    public static void main6(String[] args) {
        int[] nums = {2,7,11,15,2,7};
        int target = 9;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i]+nums[j] == target){
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }

    //给定一个非空整数数组，除了某个元素只出现一次以外，
    // 其余每个元素均出现两次。找出那个只出现了一次的元素。
    public static void find(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count = 1;
            for (int j = 0;j<array.length;j++){
                if (i == j){
                    continue;
                }
                if (array[i] == array[j]){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(array[i]);
            }
        }

    }
    public static void main7(String[] args) {
        int[] array = {2,2,1};
        find(array);
    }

    //给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
    // 你可以假设数组是非空的，并且给定的数组总是存在多数元素。

    public static int more(int[] array){
        Arrays.sort(array);
        return array[array.length/2];
    }
    public static void main(String[] args) {
        int[] array = {2,2,1,1,1,2,2};
         int ret =  more(array);
        System.out.println(ret);
    }

    //给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
    // 示例 1：
    // 输入：arr = [2,6,4,1]
    // 输出：false
    // 解释：不存在连续三个元素都是奇数的情况。
    // 示例 2：
    // 输入：arr = [1,2,34,3,4,5,7,23,12]
    // 输出：true
    // 解释：存在连续三个元素都是奇数的情况，即 [5,7,23] 。
    public static boolean find1(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 != 0){
                count++;
                if (count == 3){
                    return true;
                }
            }else {
                count = 0;
            }
        }
        return false;
    }
    public static void main9(String[] args) {
        int[] array = {1,2,34,3,4,5,7,23,12};
        boolean ret =  find1(array);
        System.out.println(ret);
    }


}