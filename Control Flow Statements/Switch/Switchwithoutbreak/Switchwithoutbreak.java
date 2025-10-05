public class Switchwithoutbreak {
    public static void main(String[] args) {
        int a =1,b=2;
        switch(a+b)
        {
            case 1: System.out.println(a+b);
                     break;
            case 2 : System.out.println(a+b);
                     break;
            case 3: System.out.println(a+b);                  // without break
                    
            case 4: System.out.println(a+b+1);               // Will Run the code 

            default : System.out.println("opps");          // will Run this statement too
                    

        }
    }

}
