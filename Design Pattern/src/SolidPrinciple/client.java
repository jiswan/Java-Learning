package SolidPrinciple;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address a = new Address("Koothuparambil");
		Employee e = new Employee(1, "jiswan", a);
		e.print();
		
		Training t = new Training(1, "jiswan", a, true, "Perumbavoor");
		t.print();
		
	}

}
