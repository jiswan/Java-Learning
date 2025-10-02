package ThrowException.tryCatchExample;

public class Employee {
    public static void main(String[] args) {
        Age objAge = new Age();
        try {
            objAge.age(2012);
            
        } catch (AgeException e) {
            System.out.print(e.getMessage());
        }
        
    }

}
