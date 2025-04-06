package leet.code;

public class FindPeakElement162 {
	public int findPeakElement(int[] nums) {
//		int peakIndex=Integer.MIN_VALUE;
		int length=nums.length;
		int left=0;
		int right=length-1;
		int mid=left+(right-left)/2;
		while(left<right)
		{	//(1,3,5,5,10,8,8,6,2)
			mid=left+(right-left)/2;
			if(nums[mid]<nums[mid+1])
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		
		return left;
		
	}
}
