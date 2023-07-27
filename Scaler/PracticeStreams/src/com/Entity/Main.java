package com.Entity;

import java.util.List;
import java.util.stream.Collectors;

public class Main {


public static void main(String[] args) {
	List<Employee>EmployeeList= List.of(new Employee("Sachin",28,25000),
			new Employee("Tapan",27,26000),
			new Employee("Akshat",26,27000),
			new Employee("RAJ",25,28000),
			new Employee("Rutwik",24,29000));
	
	EmployeeList.stream().filter(e->e.age>25).map(si->si.salary*1.10).forEach(s->System.out.println(s));
	
	List<Integer>numbers=List.of(10,12,14,22,1,01);
	numbers.stream().map(s->s+" ").filter(num->num.startsWith("1")).forEach(m->System.out.println(m));
	
}
}