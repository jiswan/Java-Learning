package StreamCode;

import java.util.ArrayList;
import java.util.List;



public class SimpleCode {
    public static void main(String[] args) {
        
       List<String> name = new ArrayList<>();
       name.add("jiswan");
       name.add("abin");
       name.add("souda");

    
       name.forEach((String i)-> System.out.println("Name is "+i));
    //using map
       name.stream()
                    .map((String i)-> i.toUpperCase())
                    .forEach((String s)-> System.out.println("Name is "+s));

    //using Filter
    List<Integer> number = new ArrayList<>();
       number.add(3);
       number.add(7);
       number.add(1);
       number.add(2);
       number.add(5);
       number.add(4);
       number.add(6);

    number.forEach((Integer i)-> System.out.println("Number is "+i));

    number.stream()
    .filter((Integer n )->n>3)
    .map(n -> -1*n)
    .peek(n1 -> System.out.println("Peeked (after map): " + n1))
    .forEach((Integer n1)->System.out.println(n1));
    
    }

}
