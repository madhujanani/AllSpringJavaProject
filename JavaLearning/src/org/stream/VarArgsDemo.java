package org.stream;

public class VarArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show(100);
		show(12,34);
		show(23,45,56);
		}
	static void show(int... a) {//int x,int y add this inside the bracs
		System.out.println("Number of Arguments :"+a.length);
//		System.out.println(x);
//		System.out.println(y);

		for (int i : a) {
			System.out.println(i);
		}
	}

}
