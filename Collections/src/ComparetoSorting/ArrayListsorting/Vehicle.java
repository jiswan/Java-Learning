package ComparetoSorting.ArrayListsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vehicle {
    public static void main(String[] args) {
        
        List<Car> carList = new ArrayList<>();                       // ArrayList 
        carList.add(new Car("lexus","v8"));
        carList.add(new Car("Dodge Charger","v6"));
        carList.add(new Car("Bmw 320i ","B48"));

        Collections.sort(carList,new CarNameSort());                // sorting decending 

        carList.forEach((Car obj)->System.out.println ("Car Name = "+obj.carName+" Car Engine Type = "+obj.engineType));


    }

}
