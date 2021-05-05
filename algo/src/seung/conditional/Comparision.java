package seung.conditional;

import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.05
 */
public class Comparision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else if (a == b) {
			System.out.println("==");
		}
	}
}
