package FunctionalInterfaceusingLambda;

public class Calculator {
    public static void main(String[] args) {
        Calaculation addition = (int x,int y) ->{ 
            System.out.print("Sum of two Number is ="+(x+y));
        };
        addition.calculate(5, 6);
    }
    

}
