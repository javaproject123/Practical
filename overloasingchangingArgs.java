package com;

public class overloasingchangingArgs {
static int sum(int a,int b) {
	return a+b;
}
static int sum (int x, int y, int z) {
	return x+y+z;
}
public static void main(String args[]) {
	System.out.println(overloasingchangingArgs.sum(5,6));
	System.out.println(overloasingchangingArgs.sum(5,6,7));
}
}
