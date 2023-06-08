package org.jd.java.collectors;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.jd.beans.EmployeeRecord;

public class UtilityClass<T> {

	public List<EmployeeRecord> addEmployees(int count) {
		
		return IntStream.range(0, count)
						.parallel()
						.mapToObj(id -> new EmployeeRecord(id, "Employee"+id, "Dept" + (id % 2),1000 * id ))
						.collect(Collectors.toList());
				
	}
}
