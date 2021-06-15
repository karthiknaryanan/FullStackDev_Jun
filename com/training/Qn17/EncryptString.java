package com.training.Qn17;

/*Given a method with a string input. 
 * Write code to encrypt the given string using following rules 
 * and return the encrypted string:
a. Replace the character at odd positions by next character in alphabet 
b. Leave the characters at even positions unchanged
Note:
if an odd position character is 'z' replace it by 'a'
assume the first character in the string is at position 1
Example input = curiosity output = dusipsjtz
*/
public class EncryptString {

	public static void main(String[] args) {
		System.out.println(encryptString("Zebra"));

	}

	public static String encryptString(String input) {
		//input = input.toLowerCase();
		String result = "";
		char ch = ' ';
		for (int i = 1; i <= input.length(); i++) {
			if (i % 2 == 0) {
				result += input.charAt(i - 1);
			} else {
				ch = input.charAt(i - 1);
				int val = ch + 1;
				ch = (char) val;
				result += ch;
			}
		}
		return result;

	}
}
