package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateWords("Bread butter and bread");
		duplicateWords("Java is java again java");
		duplicateWords("Super Man Bat Man Spider Man");
	}

	private static void duplicateWords(String string) {
		String[] words = string.split(" ");
		Map<String,Integer> wordCount = new HashMap<>();
		for(String word: words)
		{
			if(wordCount.containsKey(word.toLowerCase()))
			{
				wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
			}
			else
			{
				wordCount.put(word.toLowerCase(), 1);
			}
		}
		Set<String> wordinString = wordCount.keySet();
		for(String w:wordinString)
		{
		 if(wordCount.get(w)>1)
		 {
			 System.out.println(w+" : "+wordCount.get(w));
		 }
		}
		
		for(Entry<String, Integer> countWord : wordCount.entrySet() )
		{
			System.out.println(countWord.getKey()+" : "+countWord.getValue());
		}
	}

}
