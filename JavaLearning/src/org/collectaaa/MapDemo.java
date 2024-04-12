package org.collectaaa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {

	public static void main(String[] args) {

		/*create a collection of Employees and store them as Map having empId as key. get an empId from the user and
		if it exist int the collection then return the department name in which the employee works.*/
		Map<Integer, Employees11> empList = new HashMap<>();
		
		 Employees11 emp1= new Employees11("John", "2022-01-08", "Developer", 3000, 1,101);
		 Employees11 emp2= new Employees11("Mary", "2023-09-01", "Manager", 50000, 2,102);
		 Employees11 emp3= new Employees11("Jacob", "2021-19-11", "Developer", 4000, 1,103);
		 Employees11 emp4= new Employees11("Anu", "2020-04-20", "Designer", 50000, 3,104);
		 Employees11 emp5= new Employees11("gowri", "2022-01-08", "Developer", 3000, 1,104);
		 Employees11 emp6= new Employees11("Mike", "2023-09-01", "Manager", 50000, 2,105);
		 Employees11 emp7= new Employees11("Janu", "2021-19-11", "Developer", 4000, 1,106);
		 Employees11 emp8= new Employees11("addy", "2020-04-20", "Designer", 70000, 3,107);
		 Employees11 emp9= new Employees11("Ryan", "2022-01-08", "Developer", 3000, 1,108);
		 Employees11 emp10= new Employees11("Marsha", "2023-09-04", "Manager", 50000, 2,109);
		 Employees11 emp11= new Employees11("Kira", "2021-29-11", "Developer", 4000, 1,110);
		 Employees11 emp12= new Employees11("liam", "2022-29-11", "Designer", 4000, 3,111);
		 Employees11 emp13= new Employees11("Dono", "2021-29-11", "Developer", 3000, 1,112);
		 
		empList.put(emp1.getEmpId(), emp1);
		empList.put(emp2.getEmpId(), emp2);
		empList.put(emp3.getEmpId(), emp3);		
		empList.put(emp4.getEmpId(), emp4);
		empList.put(emp5.getEmpId(), emp5);
		empList.put(emp6.getEmpId(), emp6);
		empList.put(emp7.getEmpId(), emp7);
		empList.put(emp8.getEmpId(), emp8);
		empList.put(emp9.getEmpId(), emp9);
		empList.put(emp10.getEmpId(), emp10);
		empList.put(emp11.getEmpId(), emp11);
		empList.put(emp12.getEmpId(), emp12);
		empList.put(emp13.getEmpId(), emp13);
		
		System.out.println("Employee list :"+empList.size());		
		System.out.println("Employee list :");
		System.out.println(empList);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the EmpID");
		int empId = sc.nextInt();
		if (empList.containsKey(empId)) {
			System.out.println("Key is present ::"+empList.get(empId));
					
		} else {
			System.out.println("Key is not present");

		}
		sc.close();


	}

}
