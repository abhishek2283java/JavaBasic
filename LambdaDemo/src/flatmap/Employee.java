package flatmap;

import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private List<String> phones;
	private List<String> emails;
	
	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Employee(int id, String name, List<String> phones) {
		super();
		this.id = id;
		this.name = name;
		this.phones = phones;
	}

	public Employee(int id, String name, List<String> phones, List<String> emails) {
		super();
		this.id = id;
		this.name = name;
		this.phones = phones;
		this.emails = emails;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
