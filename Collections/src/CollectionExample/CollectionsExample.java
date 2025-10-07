package CollectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        
        List<Integer> value = new ArrayList<>();
        value.add(1);
        value.add(3);
        value.add(4);
        value.add(2);
        System.out.println(Collections.max(value));                     // find the maximum value
        System.out.println(Collections.min(value));                     // find the minimum value
        System.out.println("---------Before Sorted--------");
        value.forEach((Integer v)->System.out.print(v));
        System.out.println("\n-----------------");
        Collections.sort(value);
        System.out.println("---------After sorted--------");            // sorted in ascending order
        value.forEach((Integer v)->System.out.print(v));
        System.out.println("\n-----------------");
    }

}
