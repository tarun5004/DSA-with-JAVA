package array;

import java.util.Scanner;

public class nameArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();


        System.out.println("enter the name od students");
        String names[] = new String[size];

        // input
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
            }
        
        for (int i = 0; i < size; i++) {
            System.out.println("the names of student " + (i + 1) + " is" + names[i]);
        }
        }
    }
