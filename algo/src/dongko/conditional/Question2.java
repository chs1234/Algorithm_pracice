package dongko.conditional;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		int a = sc.nextInt();
		String rating = "";
		if(a >= 90) {
			rating = "A";
		} else if(a >= 80) {
			rating = "B";
		} else if(a >= 70) {
			rating = "C";
		} else if(a >= 60) {
			rating = "D";
		} else {
			rating = "F";
		}
		
		System.out.println(rating);
	}

}
