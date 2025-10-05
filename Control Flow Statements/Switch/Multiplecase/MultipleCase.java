public class MultipleCase {
    public static void main(String[] args) {
        int a =1,b=2;
        switch(a+b)
        {
            case 1:        
            case 2 :        
            case 3: System.out.println(a+b);                  // Multiple Case 
                    break;
            case 4: System.out.println(a+b+1);               
                     break;
            default : System.out.println("opps");          
                    

        }
    }
}
