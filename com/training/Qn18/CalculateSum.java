package com.training.Qn18;
/*Create a class with a method which can calculate the sum
 *of first n natural numbers which are divisible by 3 or 5.
Method Name - calculateSum
Argument - int n
Return Type - int sum
Logic - Calculate the sum of first n natural numbers
which are divisible by 3 or 5.
*/

public class CalculateSum {

	public static void main(String[] args) {
		CalculateSum cs = new CalculateSum();
		System.out.println(cs.calulateSum(10));
	}

	public int calulateSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
