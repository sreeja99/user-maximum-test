package com.usermaximum;

import java.util.Arrays;
import java.util.Scanner;

public class UserMaximum<E extends Comparable<E>> {
	E x,y,z;
	E max;
	public UserMaximum() {
	}
	public E toPrint() {
		return this.max;
	}
	
	E findMaximum(E ... args) {
		Arrays.sort(args);
		this.max = args[args.length-1];
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
		System.out.println("Maximum Value:"+new UserMaximum().toPrint());
	}

}
