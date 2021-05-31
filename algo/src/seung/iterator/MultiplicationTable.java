package seung.iterator;

import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.07
 */
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		n = sc.nextInt();
		if (!(1 <= n && n <= 9)) return;
		
		for (int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}
}
