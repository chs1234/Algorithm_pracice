package seung.basicMath1;

import java.util.Scanner;

/**
 * @author seung
 */
public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (C <= B) {
			System.out.println("-1");
		} else {
			System.out.println((A/(C-B)) + 1);
		}
	}
}
