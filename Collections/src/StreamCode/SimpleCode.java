package StreamCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;



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
    
    //using terminal operation toArray()
    List<Integer> number1 = Arrays.asList(2,3,5,6,1,4,10);
    int[] num = number1.stream()
                .mapToInt(i -> i*10)
                .toArray();
    for(int i: num)
    {
        System.out.println(i);
    }

    // reduce terminal operation
    Optional<Integer> reduceNumber = 
    number1.stream().reduce((Integer v1, Integer v2)->v1+v2);
    System.err.println("Reduce Number is "+reduceNumber.get());

    //min and max 
    Optional<Integer> mininum = number1.stream().min((Integer n1,Integer n2)->n1-n2);
    System.out.println(mininum.get());
    Optional<Integer> maxnum= number1.stream().min((Integer n1,Integer n2)->n2-n1);
    System.out.println(maxnum.get());

    //count
    long countnum = number1.stream()
                    .filter(i->i>3)
                    .count();
    System.out.println(countnum);

    //anymatch
    boolean anyMatchNum = number1.stream().anyMatch((Integer n)->n>5);
    System.out.println(anyMatchNum);

    //findfrist
    Optional<Integer> findNum = number1.stream().filter(i->i>5).findFirst();
    System.out.println(findNum.get());

    //findany
    Optional<Integer>findAnynum = number1.stream().filter(i->i>4).findAny();
    System.out.println(findAnynum.get());

    }

   
    
    

}
