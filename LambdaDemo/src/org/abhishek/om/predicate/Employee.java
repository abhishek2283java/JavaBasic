package org.abhishek.om.predicate;

public class Employee {
	
	String name;
	int salary;
	int bonus;
	
	Employee() {
		//no-arg constructor
	}
	
	public Employee(String name, int salary, int bonus) {
		super();
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	

}
