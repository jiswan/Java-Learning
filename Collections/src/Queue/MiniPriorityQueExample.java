package Queue;

import java.util.PriorityQueue;


public class MiniPriorityQueExample {
    public static void main(String[] args) 
    {
        PriorityQueue<Integer> value = new PriorityQueue<>();
        value.add(1);
        value.add(2);
        value.add(4);
        value.add(5);  
        System.out.println("----------------------");
        value.forEach((Integer a)-> System.out.println(a)); 
        System.out.println("----------------------");
        
        while(!value.isEmpty())
        {
            int a = value.poll();
            System.out.println("Removed value is "+a);
        }

    }

}
