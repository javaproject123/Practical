package com;

public class overloasingchangingArgs {


static int sum (int a, int b) {
	return a+b;
	static double sum (double a, double b) {
		return a+b;
	}
}
public static void main(String args[]) {
	System.out.println(overloasingchangingArgs.sum(5,6));
	System.out.println(overloasingchangingArgs.sum(5,2,6,1));
}
}
