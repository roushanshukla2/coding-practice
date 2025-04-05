package leet.code;

public class FirstUniqueCharacter387 {
	
public static void firstUniqChar(String s) {
	
		char[] arr=s.toCharArray();
		int size=arr.length;
		
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			int counter=0;
			for(int j=0;j<size;j++)
			{
				if(arr[i]==arr[j] && i!=j) {
				counter++;
				j=size+1;
				}
			}
			
			if(counter==0)
			{
				System.out.println(i);
				return ;
			}
			
		}
			
    }
public static void main(String[] args)
{
	firstUniqChar("hhello");

}
}