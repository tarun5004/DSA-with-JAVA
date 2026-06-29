import java.util.Scanner;

public class addSum {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = calculateSum(a, b);
        System.out.println("The result is: " + result);
    }
}
