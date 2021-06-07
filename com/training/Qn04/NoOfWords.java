package com.training.Qn04;

/*Find the number of words are of given length Input1:{“aa”,”b”,”cc”,”ddd”}
 *Input2:2 Output1:2
 *Input1:{“aa”,”b”,”cc”,”ddd”} Input2:1 Output1:1
 *  Input1:{“aa”,”b”,”cc”,”ddd”} Input2:3 Output1:1*/

public class NoOfWords {

	public static void main(String[] args) {

		String[] arr = { "aa", "b", "cc", "ddd" };
		int size = 3;
		for (String string : arr) {
			if (string.length() == size)
				System.out.println(string);
		}

	}
}
