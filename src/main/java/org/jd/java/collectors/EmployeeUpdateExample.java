package org.jd.java.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class EmployeeUpdateExample {

	public static final Logger log = Logger.getLogger("StreamsExample2");
	
	/*
	 * @author jitesh dundas
	 * When given a map, use the streams based expressions to update the employee attributes ( e.g. department in this example).
	 * @date 29 May 2023  
	 */
	public void testFlatMap() {
		
		Map<String, List<Employee>> map1 = new HashMap<>();
		map1.put("HR",Arrays.asList(new Employee[] {new Employee("ABC","",1000.00), new Employee("DEF",null,1000.00)}));
		map1.put("Marketing",Arrays.asList(new Employee[] {new Employee("EFG",null,1000.00), new Employee("HIJ",null,1000.00)}));
		
		List<Employee> employees = new ArrayList<>();
		map1.entrySet().forEach(x -> 
		{
			log.log(Level.INFO, "Department--{0} Employees--{1}",  new Object[] {x.getKey(),x.getValue()});
			x.getValue().stream().forEach( employee -> {
				employee.setDepartment(x.getKey());
				employees.add(employee);
			 });
		});
		
		
		log.log(Level.INFO, "Updated employees count--{0}",employees. size());
		employees.forEach(employee -> {
			log.log(Level.INFO, "Employee --{0} ", employee.toString());
		});
	}
		
}

class Employee{
	private String name;
	private String department;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public Employee(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "EmployeeBean [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(department, name, salary);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
}
