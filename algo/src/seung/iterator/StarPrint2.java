package seung.iterator;

import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.08
 */
public class StarPrint2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		if (!(1 <= cnt && cnt <= 100)) return;
		
		for (int i = 1; i <= cnt; i++) {
			for (int j = 1; j <= cnt - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
