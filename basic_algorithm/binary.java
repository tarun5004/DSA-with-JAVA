package basic_algorithm;

public class binary {
    public static void main(String[] args) {
        int nums[] = {56, 68, 70, 77, 80, 85, 90, 96, 98, 99};
        int target = 96;
        int n = nums.length, ans = -1;
        int start = 0 , end = n-1;

        while(start<= end) {
        int mid = (start+end)/2;
        if (target == nums[mid]) {
            ans = mid;
            break;
        } else if (target > nums[mid]) {
            start = mid+1;
        } else {
            end = mid - 1;
        }
        }
            System.out.println(ans);
    }
}
