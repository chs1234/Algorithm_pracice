package seung.iterator;

import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.08
 */
public class AplusB7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for (int i = 1; i <= cnt; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + (num1 + num2));
		}
	}
}
