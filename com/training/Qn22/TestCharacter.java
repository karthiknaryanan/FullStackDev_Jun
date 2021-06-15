package com.training.Qn22;

/*Given a method with a string input. 
Write code to test if first and last characters are same.
Incase they are same return 1 else return -1 as output. 
Note: consider case. Example: input = "the picture was great" 
(first character = 't', last character = 't') output = 1*/

public class TestCharacter {

	public static void main(String[] args) {
		System.out.println(checkExtremeCharacter("the picture was great"));
	}

	public static int checkExtremeCharacter(String input) {
		if (input.charAt(0) == input.charAt(input.length() - 1))
			return 1;
		return -1;
	}

}
