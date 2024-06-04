package com.tka.array;

public class Array1 {

	public static void main(String[] args) {
		int arry[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };  
		System.out.println("Displaying array elements  by giving range of index manually ");
		for (int i = 0; i < 10; i++) {
			System.out.println(arry[i]);
		}

		System.out.println("**********************************************");

		System.out.println("Displaying array elements by length");
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);
		}

		System.out.println("**************************************************");

		System.out.println("Displaying array elements by for each");
		for (int i : arry) {
			System.out.println(i);
		}
	}

}
