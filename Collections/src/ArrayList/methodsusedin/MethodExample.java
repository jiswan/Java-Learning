package ArrayList.methodsusedin;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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
    
    //get
    System.out.println("The number in index 1 is "+number.get(1));

    // set 
    number.set(1, 200);
    number.forEach((Integer a)-> System.out.print(a));
    System.out.println("");

    //Listiterator
    ListIterator<Integer> listIterator = number.listIterator();

    //Traverse the list in the forward direction
    while(listIterator.hasNext())
    {
        System.out.println("Element :"+listIterator.next()+" ,Next Index : "+listIterator.nextIndex());
    }
    
    //modeify the element (the last one returned by next())
    //The cursor is now at the end. The last returned element was the Integer object for 5
    listIterator.set(500);
    System.out.println("\nModified List after setting 5 to 500: "+number);

    //Add a new element to the list
    // Autoboxing converts the primitive int 50 to an Integer object
    listIterator.add(50);
    System.out.println("\nModified List after adding 50 : "+number);

    //traverse the list in the backward direction
    while(listIterator.hasPrevious())
    {
        System.out.println("Element :"+listIterator.previous()+",Previous Index :"+listIterator.previousIndex());
    }

    // Remove an element
    listIterator.remove();
    System.out.println("\nModified List after adding 50 : "+number);
    }

   


}
