package com.training.Qn05;

/*Find the sum of the numbers in the given input string array 
Input:{“2AA”,”12”,”ABC”,”c1a”)
Output:6 (2+1+2+1) 
Note in the above array 12 must not considered as such
it must be considered as 1,2
 */
public class SumOfNumbers {

	public static void main(String[] args) {

		String[] arr = { "2AA2", "12", "ABC", "c1a" };
		int result = 0;
		for (String arrElement : arr) {
			String[] arrOfNumbers = arrElement.split("[a-zA-Z]");
			for (String numbers : arrOfNumbers) {
				String[] number = numbers.split("");
				for (String num : number) {
					if (num.length() >= 1) {
						result += Integer.parseInt(num);

					}
				}
			}

		}

		System.out.println(result);
	}

}
