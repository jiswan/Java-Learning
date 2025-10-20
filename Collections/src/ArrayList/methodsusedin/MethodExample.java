package ArrayList.methodsusedin;

import java.util.ArrayList;
import java.util.List;

public class MethodExample {
    public static void main(String[] args) {

    List<Integer> number = new ArrayList<>();
    number.add(0,1);
    number.add(1,2);
    number.add(2,3);
    number.add(3,7);
    number.add(4,5);

    number.forEach((Integer i)-> System.out.print(i));        // collection list 

    //method size 
    System.out.println("\nSize of the List is "+number.size());

    //method isEmpty()
    
    System.out.println("Is the List is empty "+number.isEmpty());

    //method contain()
    
    System.out.println("Does it contain the number 4 in the list "+number.contains(4));
    System.out.println("Does it contain the number 7 in the list "+number.contains(7));

    // another list 

    List<Integer> number1 = new ArrayList<>();
    number1.add(0,6);
    number1.add(1,4);
    number1.add(2,8);
    number1.add(3,9);
    number1.add(4,10);

    number1.forEach((Integer i)-> System.out.print(i));
    System.out.println("");

    // adding to list

    number.addAll(4,number1);
    number.forEach((Integer i)-> System.out.print(i));
     System.out.println("");
     System.out.println("Size of the List is "+number.size());

    // remove
    System.out.println("Before remove method");
    number1.forEach((Integer i)-> System.out.print(i));
    System.out.println("");
    System.out.println("After remove method");
    number1.remove(3);
    number1.forEach((Integer i)-> System.out.print(i));
    System.out.println("");

    //removeall
    number.forEach((Integer i)-> System.out.print(i));
     System.out.println("");
    number.removeAll(number1);
    number.forEach((Integer i)-> System.out.print(i));
     System.out.println("");

        
    }

   


}
