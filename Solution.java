import java.util.*;

public class Solution {
    public boolean searchInRotatedSortedArrayII(int[] arr, int k) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // If mid element is the target
            if (arr[mid] == k) return true;

            // Handle duplicates: cannot determine sorted side
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }

            // Left half is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && k <= arr[mid]) {
                    high = mid - 1; // Search left
                } else {
                    low = mid + 1;  // Search right
                }
            }
            // Right half is sorted
            else {
                if (arr[mid] <= k && k <= arr[high]) {
                    low = mid + 1;  // Search right
                } else {
                    high = mid - 1; // Search left
                }
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 1, 1};
        int k = 3;

        Solution obj = new Solution();
        boolean ans = obj.searchInRotatedSortedArrayII(arr, k);

        if (ans)
            System.out.println("Target is present in the array.");
        else
            System.out.println("Target is not present.");
    }
}
