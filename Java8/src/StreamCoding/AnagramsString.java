package StreamCoding;

import java.util.stream.Stream;

public class AnagramsString {

	public static void main(String[] args) {
		
		String s1 = "RaceCar";
        String s2 = "CarRace";
        
        s1 = Stream.of(s1.split("")).map(x->x.toLowerCase()).sorted().toString();
        s2 = Stream.of(s2.split("")).map(x->x.toLowerCase()).sorted().toString();
        
        if(s1.equals(s2))
        {
        	System.out.print("Anagram");
        }
        else
        {
        	System.out.print("Not");
        }

	}

}
