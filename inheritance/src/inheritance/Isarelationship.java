package inheritance;

class Animal
{
    // Animal is the superclass of Mammal; 	
}

class Mammal extends Animal
{
 // 	Mammal is the subclass of Animal class
}

class Dog extends Mammal
{
  // Dog is a Subclass of both Mammal and Animal
  // Hence Dog is a Animal 
}
public class Isarelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Dog d = new Dog();// static binding;
		Animal f = new Dog(); // dynamic binding
	}

}
