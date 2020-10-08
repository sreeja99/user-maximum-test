package com.usermaximum;

import java.util.Scanner;

public class UserMaximum {
	//method for finding maximum integer
		public static Integer findMaximum(Integer x,Integer y,Integer z) {
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
				return 0;
		}

	public static void main(String[] args) {
		System.out.println("Welcome");
		//taking input
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number:");
			int x= sc.nextInt();
			System.out.println("Enter the second number:");
			int y= sc.nextInt();
			System.out.println("Enter the third number:");
			int z= sc.nextInt();
			//printing highest integer
			System.out.println("Return the maximum integer element:"+findMaximum(x,y,z));

	}

}
