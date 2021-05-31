package seung.iterator;

import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.07
 */
public class NPrintReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (!(n <= 100000)) return;
		
		for (int i = n; i > 0; i--) {
			System.out.println(i);
		}
	}
}
