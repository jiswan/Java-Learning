package String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean flag = anagram("keep","peek");
		if(flag)
		{
			System.out.println("Its a Anagram");
		}
		else
		{
			System.out.print("its not an Anagram");
		}

	}

	private static Boolean anagram(String string, String string2) {
		Boolean status = true;
		String copyString = string.replaceAll("\\s", "");
		String copyString2 = string2.replaceAll("\\s", "");
		
		if(copyString.length()!=copyString2.length())
		{
			status=false;
			return status;
		}
		else
		{
			char[] s1 = copyString.toLowerCase().toCharArray();
			char[] s2 = copyString2.toLowerCase().toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);
			if(Arrays.equals(s1, s2))
			{
				return status;
			}
			else{
				status=false;
				return status;
			}
		}
		
	}

}
