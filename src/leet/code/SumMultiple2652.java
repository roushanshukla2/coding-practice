/*
 * Given a positive integer n, find the sum of all integers in the range [1,n] inclusive that are divisible by 3,5,and 7.
 * return an integer denoting the sum of all numbers in the given range satisfying the constraint.
 * 
 * example:
 * intput n=7
 * output 21
 * 
 * 	numbers that are divisible by 3 5 7 is 3+5+6+7=21
 */
package leet.code;

public class SumMultiple2652 {
	
	
	public static int sumMultiple(int num)
	{
		int sum=0;
		for(int i=1;i<num;)
		{
			if(num%3==0 || num%5==0 || num% 7==0)
			{
				sum+=i;
				i++;
			}
		}
		return sum;
	}
	public static void main(String[] args)
	{
		System.out.println(sumMultiple(7));
	}

}
