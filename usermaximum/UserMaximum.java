package com.usermaximum;

import java.util.Scanner;

public class UserMaximum {
		//method for finding maximum String
	public static String findMaximum(String x,String y,String z) {
		String max = x;
		if(y.compareTo(x)>0)
			max =y;
		if(z.compareTo(x)>0)
			max =z;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Welcome");
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.println("Enter the first string:");
		String x= sc.nextLine();
		System.out.println("Enter the second string:");
		String y= sc.nextLine();
		System.out.println("Enter the third string:");
		String z= sc.nextLine();
		//printing highest String
		System.out.println("Maximum String"+findMaximum(x,y,z));
	}

}
