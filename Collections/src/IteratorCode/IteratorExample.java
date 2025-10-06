package IteratorCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        List<Integer> value = new ArrayList<>();
        value.add(1);
        value.add(2);
        value.add(3);
        value.add(4);

        //before iterator
        System.err.println("__________Before____________");
        for(int v:value)
            System.out.println(v);

        System.err.println("______________________");    
        Iterator<Integer> valueIterator = value.iterator();
        while(valueIterator.hasNext())
        {
            int v = valueIterator.next();
            System.err.println(v);
            if(v==3)
            {
                valueIterator.remove();
            }
        }
        System.err.println("__________After____________");
        for(int v:value)
            System.out.println(v);
        System.err.println("______________________");
    }

}
