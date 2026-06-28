package loops_pattern;

public class hollow {
    public static void main(String[] args) {
        int n = 4;
        int m = 7;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                if(i==1 || i ==n || j == 1 || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

// jab bhi starting ya ending row ho ya starting ya ending 