import java.util.*;

public class functions {
    public static void printHello(String name) {
        System.out.println("Hello, " + name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printHello(name);
    }
}