import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length-1;
        while (i<j) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            i++;
            j--;
        }


    }
}