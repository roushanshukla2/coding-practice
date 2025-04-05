
package leet.code;

public class ToLower709 {
	static String toLowerCase(String s) {
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=65 && a[i]<=90)
			{
				a[i]=(char)(a[i]+32);
			}
		}
		s=new String(a);
	
		return s;
	}

	public static void main(String[] args)
	{
		System.out.println(toLowerCase("Hello"));
	}
}
