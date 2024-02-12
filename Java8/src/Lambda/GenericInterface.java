package Lambda;

@FunctionalInterface
interface Myinterface3<T>
{
	T func(T t);
}

public class GenericInterface {

	public static void main(String[] args) {
		
        // declare a reference to GenericInterface
        // the GenericInterface operates on String data
        // assign a lambda expression to it
		Myinterface3<String> ref = (Str)->
		{
			String result ="";
			for(int i=Str.length()-1;i>=0;i--)
			{
				result +=Str.charAt(i);
			}
			return result;
		};
		
		System.out.println("Reverse String is :"+ref.func("jiswan"));
		
        // declare another reference to GenericInterface
        // the GenericInterface operates on Integer data
        // assign a lambda expression to it		
		Myinterface3<Integer> numb = (n)->
		{
			Integer result =1;
			for(Integer i =n ;i>0;i--)
			{
				result *=i;
			}
			return result;
		};
		
		System.out.println("Factorial is :"+ numb.func(5));
		
	}

}
