import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = new int[10];
        Arrays.fill(numbers,5);
        //System.out.println(Arrays.toString(numbers));
        for (int i:numbers){
            sum += i;

        }
        System.out.println("Sum: "+sum);
        int average;
        average = sum / numbers.length;
        System.out.println("Average: "+average);

        }
    }

