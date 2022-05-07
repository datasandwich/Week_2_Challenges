import java.util.Scanner;

public class ExistInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Enter an integer to search for in the array:");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        boolean found = false;
        //int j = 0;
        for (int i : arr)  {
            if (i == input) {
                System.out.println("Value " + input + " found in array.");
                found = true;
            }
        }
        if (!found){
            System.out.println("Not found");
        }
    }
}



