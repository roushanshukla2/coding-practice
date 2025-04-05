package leet.code;

public class SingleNumber136 {

public static int singleNumber(int[] nums) {
    int counter=0;    
	for(int i=0;i<nums.length;i++)
        {
        	for(int j=i+1;j<nums.length;j++) {
        		if(nums[j]==nums[i])
        		{
        			counter++;
        		}
        	}
        	if(counter==0)
        	{
        		return i;
        	}
        }
	return 0;
		
    }
	public static void main(String[] args) {
		System.out.println(singleNumber(new int[]{2,2,1}));
	}
}
