import java.util.Arrays;
import java.util.Random;

public class Duplicates {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for(int i=0;i<array1.length;i++){
            array1[i]= rand.nextInt(19)+1;
            array2[i]= rand.nextInt(19)+1;
        }
        System.out.println("Array 1: "+Arrays.toString(array1)+"\nArray 2: "+Arrays.toString(array2));
        for (int i:array1){
            for (int j:array2){
                if (i==j){
                    // In future, implement function to only print duplicates once.
                    System.out.println(j);
                }
            }
        }
    }
}
