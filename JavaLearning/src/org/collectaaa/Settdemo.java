package org.collectaaa ;

import java.util.HashSet;
import java.util.Set;


public class Settdemo {

	public static void main(String[] args) {
		// Add employees to the set
		Set <Employees11>employees=new HashSet<>();

		employees.add(new Employees11("John", "2022-01-08", "Developer", 3000, 1,101));
		employees.add(new Employees11("Mary", "2023-09-01", "Manager", 50000, 2,102));
		employees.add(new Employees11("Jacob", "2021-19-11", "Developer", 4000, 1,103));
		employees.add(new Employees11("Anu", "2020-04-20", "Designer", 50000, 3,104));
		employees.add(new Employees11("gowri", "2022-01-08", "Developer", 3000, 1,105));
		employees.add(new Employees11("Mike", "2023-09-01", "Manager", 50000, 2,106));
		employees.add(new Employees11("Janu", "2021-19-11", "Developer", 4000, 1,107));
		employees.add(new Employees11("addy", "2020-04-20", "Designer", 70000, 3,108));
		employees.add(new Employees11("Ryan", "2022-01-08", "Developer", 3000, 1,109));
		employees.add(new Employees11("Marsha", "2023-09-04", "Manager", 50000, 2,110));
		employees.add(new Employees11("Kira", "2021-29-11", "Developer", 4000, 1,111));
		employees.add(new Employees11("Reva", "2020-08-20", "Designer", 50000, 3,112));

		// Create sets of employees for each department
		Set<Employees11> developers = new HashSet<>();
		Set<Employees11> managers = new HashSet<>();
		Set<Employees11> designers = new HashSet<>();

		// Loop through the employees and add them to the appropriate department set
		for (Employees11 employee : employees) {
		String department = employee.getDesignation().toLowerCase();
		if (department.equals("developer")) {
		developers.add(employee);
		} else if (department.equals("manager")) {
		managers.add(employee);
		} else if (department.equals("designer")) {
		designers.add(employee);
		}
		}

		System.out.println("Developers: " + developers);
		System.out.println("Managers: " + managers);
		System.out.println("Designers: " + designers);

	}

}
