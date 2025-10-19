package ComparetoSorting;

import java.util.Arrays;

public class Vehicle {

    public static void main(String[] args) {
        
        Car[] carArray = new Car[5];
        carArray[0]= new  Car("lexus","v8");
        carArray[1]= new  Car("Dodge Charger","v6");
        carArray[2]= new  Car("Bmw 320i ","B48");
        carArray[3]= new  Car("Audi A4 ","EA113");
        carArray[4]= new  Car("Jaguar ","Ingenium");

        System.out.println("============================================================");
        Arrays.sort(carArray, (Car obj1, Car obj2)-> obj1.carName.compareTo(obj2.carName)); // Sorted by Car Name


        for(Car c:carArray)
        {
            System.out.println("car Name = "+c.carName+" Car Engine type = "+c.engineType);
        }
        System.out.println("============================================================");
        Arrays.sort(carArray, (Car obj1, Car obj2)-> obj1.engineType.compareTo(obj2.engineType)); // Sorted by Car EngineType
        
         for(Car c:carArray)
        {
            System.out.println("car Name = "+c.carName+" Car Engine type = "+c.engineType);
        }

    }
}
