class A
{
     int speedLimit =50;	
}
public class Runtimepolymorphism extends A {

	int speedLimit = 150;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtimepolymorphism poly = new Runtimepolymorphism();
		System.out.println(poly.speedLimit);
		A poly1 = new A();
		System.out.println(poly1.speedLimit);
		A obj = new Runtimepolymorphism();
		System.out.print(obj.speedLimit);
	}

}
