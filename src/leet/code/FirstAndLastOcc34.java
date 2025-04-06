package leet.code;

/**
 * This class finds the first and last occurrence of a target element in a sorted array.
 * Uses Binary Search (O(log n)) for both searches.
 */
public class FirstAndLastOcc34 {

    /**
     * Returns an array containing the first and last positions of the target.
     * If not found, returns [-1, -1].
     *
     * @param nums   Sorted array
     * @param target Value to find
     * @return Indexes of first and last occurrence
     */
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        if (nums.length < 1)
            return result;  // Empty array, target not found

        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);

        return result;
    }

    /**
     * Finds the first occurrence of the target using binary search.
     *
     * @param nums   Sorted array
     * @param target Value to find
     * @return Index of first occurrence or -1
     */
    private int findFirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If target found, move left to find earlier occurrence
            if (nums[mid] >= target)
                end = mid - 1;
            else
                start = mid + 1;

            if (nums[mid] == target)
                index = mid;
        }

        return index;
    }

    /**
     * Finds the last occurrence of the target using binary search.
     *
     * @param nums   Sorted array
     * @param target Value to find
     * @return Index of last occurrence or -1
     */
    private int findLast(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If target found, move right to find later occurrence
            if (nums[mid] <= target)
                start = mid + 1;
            else
                end = mid - 1;

            if (nums[mid] == target)
                index = mid;
        }

        return index;
    }
}
