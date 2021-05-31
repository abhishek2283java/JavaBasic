package flatmap;

import java.util.List;
import java.util.stream.Collectors;

public class DemoClass {

	public static void main(String[] args) {

		List<Employee> employees = EmployeeDb.getEmployees();

		// map to get names of all employees
		List<String> names = employees.stream().map(e -> e.getName())
				// .forEach(name -> System.out.println(name));
				// .forEach(System.out::println);
				.collect(Collectors.toList());
		System.out.println(names);

		// Print all the phone numbers
		List<List<String>> phones = employees.stream().map(e -> e.getPhones()).collect(Collectors.toList());
		System.out.println(phones);

		// Print all the phone numbers
		List<String> phones2 = employees.stream().flatMap(e -> e.getPhones().stream()).collect(Collectors.toList());
		System.out.println(phones2);
		
		// Print all the emails
		List<String> emails = employees.stream().flatMap(e -> e.getEmails().stream()).collect(Collectors.toList());
		System.out.println(emails);
		
		// Print all the emails in Upper case
		List<String> emails2 = employees.stream().flatMap(e -> e.getEmails().stream()).map(email -> email.toUpperCase()).collect(Collectors.toList());
		System.out.println(emails2);

	}

}
