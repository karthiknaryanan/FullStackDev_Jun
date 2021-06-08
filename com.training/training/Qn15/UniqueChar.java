package com.training.Qn15;

/*Display unique characters in a string. 
input:"helloworld" output:"helowrd"*/

public class UniqueChar {

	public static void main(String[] args) {
		String input = "helloworld";
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			result += input.charAt(i);
			input = input.replace(input.charAt(i), ' ');
		}
		result = result.replaceAll(" ", "");
		System.out.println(result);
	}

}
