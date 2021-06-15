package com.training.Qn16;

/*Given a method with two strings as input.
Write code to modify the first string 
such that all characters are replaced by plus sign(=) 
except the characters which are present in the second string. 
That is, if one or more characters of first string appear in second string, 
they will not be replaced by +.
Return the modified string as output. Note-ignore case.
Example: input1 = New York input2 = New Jersy output = New Y+r+ 
*/

public class ReplaceString {

	public static void main(String[] args) {

		System.out.println(stringReplace("New York", "New Jersy"));
	}

	public static String stringReplace(String str1, String str2) {
		String result = "";
		String arr[] = str1.split("");
		for (String string : arr) {
			if ((str2.toLowerCase()).contains(string.toLowerCase())) {
				result += string;
			} else
				result += "+";
		}

		return result;
	}
}
