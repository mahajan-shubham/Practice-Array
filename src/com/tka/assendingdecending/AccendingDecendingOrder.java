 package com.tka.assendingdecending;

import java.util.Arrays;

public class AccendingDecendingOrder {

	public static void main(String[] args) {
		int arr[]= {12,56,25,96,45,78,2,1,6,10};
		
		Arrays.sort(arr);
		System.out.println("Display the Array in Accending Order");
		for(int i=0;i<10;i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		
		System.out.println("Display the Array in Desending Order");
		for(int i=10-1;i>=0;i--) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		

	}

}
