package CollectionExample;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        
        List<Integer> value = new ArrayList<>();
        value.add(1);
        value.add(2);
        value.add(3);
        value.add(4);

        System.out.println("Size of List -- "+value.size());
        System.out.println("Is the List is Emplty? "+value.isEmpty());
        System.out.println(value.contains(5));
        value.add(5);
        System.out.println(value.contains(5));
        System.out.println(value.remove(3));
        System.out.println("-----------------");
        value.forEach((Integer n)->System.out.println(n));
        System.out.println("-----------------");
    }
}
