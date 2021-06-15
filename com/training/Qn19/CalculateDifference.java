package com.training.Qn19;

/*Create a class with a method to find the difference between 
 *the sum of the squares and the square of the sum 
 *of the first n natural numbers.
Method Name - calculateDifference
Argument - int n
Return Type - int sum
Logic - Find the difference between the sum 
of the squares of the first n natural numbers and 
the square of their sum. For Example if n is 10,
you have to find (1^2+2^2+3^2+….9^2+10^2)- (1+2+3+4+5…+9+10)^2
*/

public class CalculateDifference {

	public static void main(String[] args) {
		CalculateDifference cd = new CalculateDifference();
		System.out.println(cd.calculateSquareSum(10));
	}

	public int calulateDiff(int n) {
		return calculateSquareSum(n) - calculateSum(n);
	}

	public int calculateSquareSum(int n) {
		int sumOfSquares = 0;
		for (int i = 1; i <= n; i++) {
			sumOfSquares += Math.pow(i, 2);
		}
		return sumOfSquares;
	}

	public int calculateSum(int n) {
		int sumofNnums = 0;
		for (int i = 1; i <= n; i++) {
			sumofNnums += i;
		}
		return sumofNnums;
	}

}
