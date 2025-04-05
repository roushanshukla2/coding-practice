/*
 * You are given an integer array nums, an integer array queries, and an integer x.

For each queries[i], you need to find the index of the queries[i]th occurrence of x in the nums array.
 If there are fewer than queries[i] occurrences of x, the answer should be -1 for that query.

Return an integer array answer containing the answers to all queries.

 */



package leet.code;

import java.util.ArrayList;
import java.util.List;

public class OccuranceOfElement3159 {
	
	public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
		List<Integer> occurrences = new ArrayList<>();
        
        // Step 1: Collect indexes where nums[i] == x
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                occurrences.add(i);
            }
        }
        
        int[] result=new int[queries.length];
        
        
        
        	for(int i=0;i<queries.length;i++)
        	{ //{1,3,2,4}
        		int occurrenceIndex =queries[i];
        		if(occurrenceIndex >occurrences.size()) {
        			result[i]=-1;}
        		else
        			result[i]=occurrences.get(occurrenceIndex-1);
        	}
		
		
		return result;
    }

}
