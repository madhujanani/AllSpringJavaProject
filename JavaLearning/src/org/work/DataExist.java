package org.work;

import java.util.Arrays;
import java.util.Scanner;

public class DataExist {

	//Assignment#1: Take multiple course names from the user and save them in an array then ask the user to search for a course, 
	//if the course exist then output: "Course is Available" else output: "Course is not available"
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the Number of Courses "); 
		int  arr_size = sc.nextInt(); 

		String [] arr = new String [arr_size];

		System.out.println( "Enter the Courses here: "); 
		for (int i = 0; i < arr_size; i++) { 
			arr[i] = sc.nextLine();  
		} 
		System.out.print( "The Courses are: ");
		for (int i = 0; i < arr_size; i++) { 
			System.out.print(arr[i] + " ");
		} 
		System.out.println("\n");
		System.out.println( "Enter the course You want to Search ");
		String searchCourse = sc.nextLine();
		for (int i = 0; i < arr.length; i++) {
			if (arr [i].equals(searchCourse)) {
				System.out.println("Course is Available" );	    		    		   
			} 
			else {
				System.out.println("Course is  Not Available" ); 
			}		
		}
	}
}
