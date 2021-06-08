package com.training.Qn14;

/*Concatenate the character in a given position.
If there is no character in a given position place "$" sign. 
input1[]={"abc","da","ram"}; input2=3; 
hint : 3rd character is "c" in "abc" 3rd character is not present in "da",
so place "$" 3rd character is "m" in "ram" 
concate all the characters to a single string "c$m" o/p string ="c$m";*/

public class Concatenate {

	public static void main(String[] args) {

		String input1[] = { "abc", "da", "ram" };
		int input2 = 3;
		String result = "";
		for (String string : input1) {
			if (string.length() >= input2) {
				char charAt = string.charAt(input2 - 1);
				result += charAt;
			}else result+="$";

		}
		System.out.println(result);
	}

}
