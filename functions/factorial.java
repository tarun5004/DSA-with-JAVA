import java.util.*;

public class factorial {
    public static void calculateFactorial(int n) {

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        } else if (n == 0) {
            System.out.println("The factorial of 0 is: 1");
            return;
        }
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("The factorial of " + n + " is: " + fact);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateFactorial(n);
    }
}


