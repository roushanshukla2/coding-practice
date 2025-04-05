package leet.code;

public class FindPeakElement162 {
	public int findPeakElement(int[] nums) {
		int peakIndex=-1;
		int length=nums.length;
		for(int i=0;i<length-1;i++)
		{
			if(nums[i]<nums[i+1])
			{
				peakIndex=i+1;
			}
		}
		return peakIndex;
		
	}
}
