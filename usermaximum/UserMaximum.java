package com.usermaximum;

import java.util.Scanner;

public class UserMaximum {
	//method for finding maximum value
	public static <E extends Comparable<E>> E findMaximum(E x,E y,E z) {
			E max = x;
			if(y.compareTo(max)>0)
				max =y;
			if(z.compareTo(max)>0)
				max =z;
			return max;
		}

	public static void main(String[] args) {
		System.out.println("Welcome");
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.println("Enter the first value:");
		String x= sc.nextLine();
		System.out.println("Enter the second value:");
		String y= sc.nextLine();
		System.out.println("Enter the third value:");
		String z= sc.nextLine();
		//printing highest value
		System.out.println("Maximum Value:"+findMaximum(x,y,z));
	}

}
