package org.work;

import java.util.Scanner;

public class CountCharacter {
	// Count the number of repeated character in a given string	 
	static final int MAX_CHAR = 256;  
	static void repeatChar(String str)  
	{  
		int count[] = new int[MAX_CHAR];	  
			for (int i = 0; i < str.length(); i++)  
				count[str.charAt(i)]++;  
			char ch[] = new char[str.length()];  
			for (int i = 0; i < str.length(); i++)   
			{  
				ch[i] = str.charAt(i);  
				int find = 0;  
				for (int j = 0; j <= i; j++)   
					{  
						if (str.charAt(i) == ch[j])  
							find++;  
					}             
			if (find == 1)  
			System.out.println( str.charAt(i)+ " ===========>" + count[str.charAt(i)]);  
			}  
			}  
	public static void main(String args[])  
	{  
	String str = "Welcome to java"; 
	repeatChar(str);  
	}  
	}  
		     



	
