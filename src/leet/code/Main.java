package leet.code;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
        // Sample input
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;

        // Create object of your main logic class
        FirstAndLastOcc34 obj = new FirstAndLastOcc34();

        // Call the method and get the result
        int[] result = obj.searchRange(nums, target);

        // Print the result
        System.out.println("First and Last Occurrence of " + target + ": " + Arrays.toString(result));
    }
}
