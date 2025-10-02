package ThrowException.tryCatchExample;

import java.time.Year;

public class Age  {
    
    public void  age(int x) throws AgeException
    {
     int currentYear = Year.now().getValue();
     int age=currentYear-x;
     if(age<18)
     {
          throw new AgeException("Acess Denied");
     }
     else{
        System.out.println("Acess Granded");
     }

    }

}
