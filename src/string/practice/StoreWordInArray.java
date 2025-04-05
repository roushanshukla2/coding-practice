package string.practice;

public class StoreWordInArray {
	public static void main(String[] args)
	{
		String st="alice and bob love leetcode alice";
		String[] words=st.split(" ");
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
			if(words[i].equals("alice"));
			{
				System.out.println("Found");
			}
		}
	}
}
