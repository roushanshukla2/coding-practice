package leet.code;

public class SentenceIsPangram1832 {
	
	public static boolean checkIfPangram(String sentence) {
        char[] charc=sentence.toCharArray();
        int size=charc.length;
        for(char ch='a';ch<='z';ch++)
        {
            boolean isPangram=false;
            for(int i=0;i<size;i++)
            {
                if(ch==charc[i])
                {
                    isPangram=true;
                    i=size+1;
                }
            }
            if(!isPangram)
            {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args)
	{
		System.out.println(checkIfPangram("leetcode")?"True":"False");
	}
}
