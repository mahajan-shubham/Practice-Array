package com.tka.arrayeven_odd;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Display Even number of Array");

		for (int i = 1; i < 10; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i]);
				System.out.println();
			}
		}

		System.out.println("*************************************");
		System.out.println("Display Odd Numbers form the Array");

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("**************************************");
        
		System.out.println("Display Number which is divisible by 5");
		
		for(int i=1;i<=10;i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
	}

}
