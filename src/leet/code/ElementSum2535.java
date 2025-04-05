/*
 * Difference Between Element Sum and Digit Sum of an Array
 * Example:-
 * 	nums={1,15,,6,3}
 * 	output 9
 * 	Element Sum of number 1+15+6+3=25
 * 	Digit sum of  number is 1+1+5+6+3=16
 * 		difference 25-16=9
 * */
package leet.code;

public class ElementSum2535 {
	public static int elementSum(int[] num) {
		int sum=0;
		for(int i:num)
			sum+=i;
		return sum;
	}
	public static int digitSum(int[] num)
	{
		int sum=0;
		for(int i:num)
		{
			while(i>0)
			{
				sum+=(i%10);
				i/=10;
			}
		}
		return sum;
	}
	public static int sumDifference(int[] num)
	{
		return (elementSum(num)-digitSum(num));
	}
	public static void main(String[] args)
	{
		int num[]= {1,15,6,3};
		System.out.println(sumDifference(num));
		
	}

}
