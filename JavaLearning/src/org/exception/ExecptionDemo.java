package org.exception;

import java.util.Scanner;

public class ExecptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of Inputs you wish to give....");
		int totalInputs = sc.nextInt();
		int [] numbers =new int [totalInputs];

		for (int i = 0; i < totalInputs; i++) {
			System.out.println("Enter the Numbers");
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("The numbers  using forEach loop are  :\n");
		for (int num : numbers) {
			if (num>0) {
				System.out.print(num + " , ");
			} 
			else {
				try {
					throw new NegativeNumberInsertedException();
				} 
				catch (NegativeNumberInsertedException e) {
					e.printStackTrace();
				}
				System.out.println("negative");
			}
		}
		
		System.out.println("\n");
		System.out.println("The numbers  using normal loop are :\n");
		for (int i = 0; i < totalInputs; i++) {
			System.out.print(numbers[i] + " , ");			
		}
		sc.close();
	}

}



