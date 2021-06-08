package com.training.Qn01;

public class CountVowel {

	public static void main(String[] args) {
		String str = "NewyorkE";
		int count = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char val = str.charAt(i);
			if (val == 'a' || val == 'e' || val == 'i' || val == 'o' || val == 'u') {
				count++;
				str = str.replace(val, ' ');
			}
		}
		System.out.println("No. of Vowels in the given string is : " + count);
	}
}
