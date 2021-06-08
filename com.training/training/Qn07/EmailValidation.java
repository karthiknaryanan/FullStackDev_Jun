package com.training.Qn07;

/*Email Validation. Output is false if the validation fails else true. 
String input1="test@gmail.com" 
1)@ & . should be present; 
2)@ & . should not be repeated; 
3)there should be four charcters between @ and .; 
4)there shouls be atleast 3 characters before @ ; 
5)the end of mail id should be .com; 
Expected Output=true*/

public class EmailValidation {

	public static void main(String[] args) {
		String input1 = "test@gmail.com";
		boolean flag = false;
		if (input1.matches("^[\\w]{3,}@[\\w]{4,5}\\.com$"))
			flag = true;
		System.out.println(flag);
	}

}
