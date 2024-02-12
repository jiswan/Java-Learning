package Lambda;

@FunctionalInterface
interface Myinterface1
{
	String reverse(String s);
	}
public class Lambdawithparameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("String Before Reverse is jiswan");
		Myinterface1 ref= (s)->{
			String result ="";
			for(int i =s.length()-1;i>=0;i--)
			{
				result += s.charAt(i);
			}
			return result;
		};
		 
		
		System.out.print("Reverse String is :"+ ref.reverse("jiswan"));
	}

}
