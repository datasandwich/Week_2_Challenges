import java.util.Arrays;
import java.util.Random;

public class MaxAndMin {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]= rand.nextInt(10);
        }
        int max = arr[0];
        int min = arr[0];

        for (int j : arr) {
            //max = arr[0];
            if (max < j) {
                max = j;
            }
            if (min > j) {
                min = j;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max);
        System.out.println(min);
    }
}
