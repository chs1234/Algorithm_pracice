package seung.iterator;

import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.08
 */
public class StarPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		if (!(1 <= cnt && cnt <= 100)) return;
		
		for (int i = 1; i <= cnt; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
