package Map.Methods;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        
        Map<Integer,String> studentName = new HashMap<>();
        studentName.put(null, "Name");
        studentName.put(0, null);
        studentName.put(1, "abin");
        studentName.put(2, "souda");
        studentName.put(3, "basheer");

        for(Map.Entry<Integer,String> name : studentName.entrySet())               // entryset()
        {
            Integer studentKey = name.getKey();
            String studentValue = name.getValue();
            if ( studentKey == null) {                                  // if the key is null 

                System.out.println("key is Null Value is "+studentValue);
            } else {
                System.out.println("key is "+studentKey+"    Value is "+studentValue);
                
            }
            
        }

        // Size 
        System.out.println("Size of Collection Map is "+studentName.size());

        //containsKey()
        System.out.println("Does Collection contain the key "+studentName.containsKey(3));

        //containsValue()
        System.out.println("Does Collection contain the value "+studentName.containsValue("jbsa"));

        
        studentName.putIfAbsent(null, "Name of Student");                   // didnt replace the null key 
        studentName.putIfAbsent(0, "Muhammed Jiswan");                     // null value replace with this value 
         for(Map.Entry<Integer,String> name : studentName.entrySet())               // entryset()
        {
            Integer studentKey = name.getKey();
            String studentValue = name.getValue();
            if ( studentKey == null) {                                  // if the key is null 

                System.out.println("key is Null Value is "+studentValue);
            } else {
                System.out.println("key is "+studentKey+"    Value is "+studentValue);
                
            }
            
        }
        


    }

}
