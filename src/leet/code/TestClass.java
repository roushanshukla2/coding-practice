package leet.code;

import java.util.Arrays;

public class TestClass {
	public static void main(String[] args) {
		OccuranceOfElement3159 test= new OccuranceOfElement3159();
		int[] arr= {1,3,1,7};
		int[] arr1={1,3,2,4};
		int[] result= test.occurrencesOfElement(arr, arr1, 1);
		System.out.println(Arrays.toString(result));
		
		
		
		System.out.println("Searching Find Peak Element:");
		FindPeakElement162 find= new FindPeakElement162();
		System.out.println(find.findPeakElement(new int[] {1,2,1,3,5,6,4}));
		}
}
