import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {4, 6, 5, 9, 2, 9, 7, 3, 5, 6, 2, 1};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if(min != i) {

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}