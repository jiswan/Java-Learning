package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {

	public static void main(String[] args) {
		
		String Sentence = "Java 8 introduces new features like lambda expressions and streams";
		//String[] words = Sentence.split(" ");
		List<String> wordslist = Arrays.asList(Sentence.toLowerCase().split("\\s+"));
		wordslist.forEach(x->System.out.print(x));
		Map<String, Long> count = wordslist.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println("\nWord Count");
		count.forEach((x,c)->System.out.println(x+" "+c));

	}

}
