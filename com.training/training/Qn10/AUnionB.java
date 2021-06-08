package com.training.Qn10;

/*Find A union B 
Sample input: int[] a={1,2,3,4}; int[] b={3,4,5,6}; 
Sample output: int[] c={1,2,3,4,5,6}*/

public class AUnionB {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 4, 5, 6 };
		int[] result =null;
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
					result[i]= a[i];
				}
			}
		}
	}
}
