package com.training;

public class Calculator {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Addition of Two Numbers: "+(a+b));
		System.out.println("Subtraction of Two Numbers: "+(a-b));
		System.out.println("Multiplication of Two Numbers: "+(a*b));
		System.out.println("Division of Two Numbers: "+(a/b));
	}
}
