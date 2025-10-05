public class SwitchExpression {
    public static void main(String[] args) {
        
        int a =1;
        String value = switch(a)
        {
            case 1 -> "jiswan";    // Return the String Value and breank from Switch 
            case 2 -> "Abin";
            default -> "None";
        };
        System.out.println(value);
    }

}
