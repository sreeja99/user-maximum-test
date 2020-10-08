package com.usermaximum;

import java.util.Scanner;

public class UserMaximum<E extends Comparable<E>> {
	E x,y,z;
	E max;
	public UserMaximum(E x,E y,E z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public E toPrint() {
		return this.findMaximum(x,y,z);
	}
	
	private E findMaximum(E x, E y, E z) {
		E max=x;
		if(y.compareTo(max)>0)
			max=y;
		if(z.compareTo(max)>0)
			max=z;
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
		System.out.println("Maximum Value:"+new UserMaximum(x,y,z).toPrint());
	}

}
