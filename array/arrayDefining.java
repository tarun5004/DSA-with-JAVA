package array;

public class arrayDefining {
    public static void main(String[] args) {
        int[] marks = new int[5]; // defining an array of size 5
        marks[0] = 10; // assigning values to the array
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;

        // printing the array elements
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Element at index " + i + ": " + marks[i]);
        }
    }
}
