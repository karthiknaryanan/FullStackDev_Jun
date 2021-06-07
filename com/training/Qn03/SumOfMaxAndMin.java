package com.training.Qn03;

/*Find the sum of maximum and minimum number 
 * from a given input array Input:{19,17,12} max - 19 min - 12 sum - 31 
 * Output:31
 */

public class SumOfMaxAndMin {

	public static void main(String[] args) {

		int[] arr = { 19, 17, 12 };
		int max = arr[0], min = arr[0], sum = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}

		sum = max + min;
		System.out.println("Sum of Max and Min No. of the given array: " + sum);

	}

}
