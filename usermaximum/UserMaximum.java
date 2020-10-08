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
	public void print() {
		System.out.println(max);
		
	}



}
