import java.util.*;


public class inputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");

        int size = sc.nextInt();
        int[]arr = new int[size];
        System.out.println("Enter the elements of the array: ");

        // taking input for the array elements
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // printing the array elements
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
