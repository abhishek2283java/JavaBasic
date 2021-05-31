package map_methodreference;

import java.util.HashMap;
import java.util.Map;

public class DemoMapMethodReference {

	public static void main(String[] args) {
		
		Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
		
		empMap.put(1, new Employee(1, "Abhikriti"));
		empMap.put(2, new Employee(2, "Kirti"));
		empMap.put(3, new Employee(3, "Abhishek"));
		
		//Print the employee name in upper case using lambda expression
		empMap.values().forEach(emp -> System.out.println(emp.getName().toUpperCase()));
		
		//Print the employee name in upper case using method reference
		empMap.values().stream().map(emp -> emp.getName().toUpperCase()).forEach(System.out::println);
	}

}
