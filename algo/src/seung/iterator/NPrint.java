package seung.iterator;

import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.07
 */
public class NPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (!(n <= 100000)) return;
		
		for (int i = 0; i < n; i++) {
			System.out.println(i+1);
		}
	}
}
