package inheritance;

class Address
{
   private String street;
   private String city;
   private String zipcode;
   
   

public Address(String street, String city, String zipcode) {
	super();
	this.street = street;
	this.city = city;
	this.zipcode = zipcode;
}



@Override
public String toString() {
    return street + ", " + city + ", " + zipcode;
	}
   
   
}

class Person
{
	private String name;
	private Address address;
	public Person(String name, Address address) {
		
		this.name = name;
		this.address = address;
	}
	public Address getAddress()
	{
		return address;
	}
	
}
public class Hasarealationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address personaddress = new Address("387 Burton ave", "Sudbury", "p3c4k4");
		Person person = new Person("jiswan", personaddress);
		Address addressFromPerson = person.getAddress();
		System.out.print(addressFromPerson);

	}

}
