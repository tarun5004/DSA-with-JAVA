package array;

import java.util.Scanner;

public class sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int [size];
        
        // input
        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        // checking isSorted or not 
        for (int i = 0; i < numbers.length- 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("The arry is ascending" + numbers);
            }else {
                System.out.println("the array is decending order or not sorted ");
            }
        }
    }

