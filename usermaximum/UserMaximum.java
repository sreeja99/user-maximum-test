package com.usermaximum;

import java.util.Scanner;

public class UserMaximum {
		//method for finding maximum float
		public static Float findMaximum(Float x,Float y,Float z) {
			int a = x.compareTo(y);
			int b = y.compareTo(z);
			int c = x.compareTo(z);
			if(a==1&&c==1)
				return x;
			else if(b==1&&a==-1) 
				return y;
			else if(b==-1&&c==-1)
				return z;
			else 
				return 0.0f;
		}

	public static void main(String[] args) {
		System.out.println("Welcome");
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.println("Enter the first number:");
		float x= sc.nextFloat();
		System.out.println("Enter the second number:");
		float y= sc.nextFloat();
		System.out.println("Enter the third number:");
		float z= sc.nextFloat();
		//printing highest float
		System.out.println("Maximum float element:"+findMaximum(x,y,z));

	}

}
