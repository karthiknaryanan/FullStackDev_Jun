package com.training.Qn08;

/*Square root calculation ((x1+x2)(x1+x2))+((y1+y2)(y1+y2)) 
o/p should be rounded of to int; 
Sample input: double x1=5; double x2=6; double y1=8; double y2=3; 
output : 15*/

public class SquareRootCalc {

	public static void main(String[] args) {
		double x1 = 5, x2 = 6;
		double y1 = 8, y2 = 3;
		double result = (((x1 + x2) * (x1 + x2)) + ((y1 + y2) * (y1 + y2)));
		int sqrt = (int) Math.sqrt(result);
		System.out.println("Square: " + sqrt);
	}

}
