package com.training.Qn06;

/*Convert String array to String String[] 
input1=["Vikas","Lokesh",Ashok] 
Expected output String: "Vikas,Lokesh,Ashok"*/

public class StringArray {

	public static void main(String[] args) {
		String[] arr = { "Vikas", "Lokesh", "Ashok", "Manic" };
		String result = "";
		int size = arr.length;

		for (int i = 1; i < size - 1; i++) {
			result += arr[i] + ",";
		}
		System.out.println("\"" + arr[0] + "," + result + arr[size - 1] + "\"");
	}

}
