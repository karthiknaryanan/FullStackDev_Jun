package com.training.Qn21;

/*Given a method with an int array. 
Write code to find the power of each individual element 
according to its position index, add them up and return as output.
Example: input = {3,6,2,1} output = (3)0+(6)1+(2)2+(1)3 = 1+6+4+1=12*/

public class ElementSumPower {

	public static void main(String[] args) {

		ElementSumPower ep = new ElementSumPower();
		int result = ep.calculateSumOfPower(new int[] { 3, 6, 2, 1 });
		System.out.println(result);
	}

	public int calculateSumOfPower(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += Math.pow(arr[i], i);
		}

		return sum;
	}
}
