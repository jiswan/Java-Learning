package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
        list.add("Dave");
        list.add("Joe");
        list.add("Ryan");
        list.add("Iyan");
        list.add("Ray");	
        
        list.stream()
        .map(l->l.toUpperCase())
        .forEach(System.out::println);
        
        list.stream()
        .forEach(System.out::println);
	}

}
