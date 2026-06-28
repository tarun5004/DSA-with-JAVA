import java.util.*;
public class loops {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");45
        // int n = sc.nextInt();
        // int a = 5;
        int b = 10;
        int sum = 0;
        for(int count =1; count<=b; count++){
            sum += count;
            System.out.println(count);
        }
        System.out.println("Sum: " + sum);
    }
}
