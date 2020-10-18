package com.HCLproject1.ResponseEntity;

public class EmployeeResponseEntity {
	private int id;
	private String name;
	private int salary;

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

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public EmployeeResponseEntity(int id, String name, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}

@Override
public String toString() {
	return "EmployeeResponseEntity [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

public EmployeeResponseEntity() {
	super();
	// TODO Auto-generated constructor stub
}

}
