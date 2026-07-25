package basic_algorithm;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {4, 6, 5, 9, 2, 9, 7, 3, 5, 6 , 2, 1};

        int n = arr.length;
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<i; j++) {
                if(arr[i] > arr[i+1]) {
                    int temp[] = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                }
            }
        }
    }
}
