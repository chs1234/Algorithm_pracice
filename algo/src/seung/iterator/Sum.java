package seung.iterator;

import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.07
 */
public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		if (!(1 <= n && n <= 10000)) return;
		
		for (int i = 1; i <= n; i++) {
			result += i;
			
			if (i == n)
				System.out.println(result);
		}
	}
}
