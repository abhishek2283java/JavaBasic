package flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDb {
	
	public static List<Employee> getEmployees() {
		
//		return Stream.of(
//				new Employee(1, "Tom", Arrays.asList("123456", "456789")),
//				new Employee(2, "Jack", Arrays.asList("444444", "555555")),
//				new Employee(3, "Harry", Arrays.asList("666666", "777777"))
//				).collect(Collectors.toList());
		
		return Stream.of(
				new Employee(1, "Tom", Arrays.asList("123456", "456789"), Arrays.asList("a@b.com", "b@c.com")),
				new Employee(2, "Jack", Arrays.asList("444444", "555555"), Arrays.asList("d@e.com", "f@g.com")),
				new Employee(3, "Harry", Arrays.asList("666666", "777777"), Arrays.asList("h@i.com", "j@k.com"))
				).collect(Collectors.toList());
		
	}

}
