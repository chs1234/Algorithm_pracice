package seung.iterator;

import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.07
 */
public class AplusB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (a <= 0 || b >= 10) return;
			
			System.out.println(a + b);
		}
	}
}
