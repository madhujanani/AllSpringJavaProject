package org.work;

import java.util.Scanner;
public class EvenOdd { 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the size of the array: "); 
		int  arr_size = sc.nextInt(); 
		int[] arr = new int[arr_size];

		System.out.println( "Enter the elements of the array: "); 
		for (int i = 0; i < arr_size; i++) { 
			arr[i] = sc.nextInt();  
		} 
		System.out.println( "The elements of the array are: ");
		for (int i = 0; i < arr_size; i++) { 
			System.out.print(arr[i] + " \n");
		} 
		for (int i = 0; i < arr_size; i++) { 
			if (arr[i]%2==0) {
				System.out.print("Even Number :");
				System.out.println(arr[i]+ " "); 
			}
			else {
				System.out.print("Odd Number  : ");
				System.out.println(arr[i]+ " ");
			}

		}sc.close(); 
	} 
} 



















