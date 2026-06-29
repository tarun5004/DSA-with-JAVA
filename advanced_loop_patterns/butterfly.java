package advanced_loop_patterns;

public class butterfly {
    public static void main(String[] args) {
        int n = 5;
        // outer loop for the number of rows
        for(int i = 1; i <= n; i++) {

            // inner loop for printing stars in the left half

            for(int j = 1; j<= i; j++) {
                System.out.print("* ");
            }
            // inner loop for printing spaces in the middle

            int spaces = 2*(n-i);
            for(int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            // inner loop for printing stars in the right half
            for(int j = 1; j<= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // flipping the pattern for the lower half of the butterfly
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j<= i; j++) {
                System.out.print("* ");
            }
            int spaces = 2*(n-i);
            for(int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j<= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
        
