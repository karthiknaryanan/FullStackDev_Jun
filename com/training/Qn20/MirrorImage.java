package com.training.Qn20;

/*Create a class containing a method to create the mirror image of a String. 
 * The method should return the two Strings separated with a pipe(|) symbol .
Method Name - getImage
Argument - String
Return Type - String
Logic - Accepts One String. 
Find the mirror image of the String. 
Add the two Strings together separated by a pipe(|) symbol. 
For Example Input : EARTH Output : EARTH|HTRAE
*/

public class MirrorImage {

	public static void main(String[] args) {
		MirrorImage mi = new MirrorImage();
		System.out.println(mi.getImage("EARTH"));
	}

	public String getImage(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result = str + "|" + result;

	}

}
