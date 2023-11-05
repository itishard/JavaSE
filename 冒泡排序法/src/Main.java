import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = null;
        for (int i = 0;i<array.length-1;i++) {
            if(array == null) {
                break;
            }
            //每次比上一次少走一个目标
            boolean flag = false;//定义flag

            for (int j = 0;j<array.length-1-i;j++) {
                if (array[j] >array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = true;//存在交换
                }
            }
            if (!flag) {
                break;//没有发生交换 说明有序
            }
        }
        System.out.println(Arrays.toString(array));
    }
}