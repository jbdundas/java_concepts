package org.jd.beans;

public record EmployeeRecord(int id, String name, String department, float salary) {

	public Object beautify() {
		return "ID:" + id + " | " + "Name:" + name + " | " + " Salary:"+ salary + " | ";
	}

}
