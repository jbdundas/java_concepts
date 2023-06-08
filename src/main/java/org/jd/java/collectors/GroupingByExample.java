package org.jd.java.collectors;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.jd.beans.EmployeeRecord;

public class GroupingByExample {

	public static final Logger log = Logger.getLogger("GroupingByExample");
	
	public void printEmployeesCountByDept(int employeesCount) {
		
		var employees = generateEmployees();
		
		var result = employees.stream().filter(employee -> !employee.name().isBlank())
		.collect(Collectors.groupingBy(employee -> employee.department(), Collectors.counting()));
		
		log.log(Level.INFO, "Total Employees by Department -> {0}",result);
		
	}

	private List<EmployeeRecord> generateEmployees() {
		UtilityClass<EmployeeRecord> utilityClass = new UtilityClass<>();
		var employees = utilityClass.addEmployees(100);
		return employees;
	}

	public void printEmployeesByDept(int i) {
		
		var employees = generateEmployees();
		
		var employeeByDept = employees.stream()
				.filter(employee -> !employee.name().isBlank())
				.collect(Collectors.groupingBy(employee -> employee.department()));
		employeeByDept.forEach((k,v) -> {
			log.log(Level.INFO, "Dept={0} Employee Count ={1}", new Object[] {k,v.size()});
			log.log(Level.INFO, "Employees:");
			v.forEach(employee -> log.log(Level.INFO, "Employee--{0}", employee.beautify()));
		});
	}
}
