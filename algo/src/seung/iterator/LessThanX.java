package seung.iterator;

import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.08
 */
public class LessThanX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] arr = new int[N];
		
		if (!(1 <= N && X <= 10000)) return;
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
				
		for (int i = 0; i < N; i++) {
			if (arr[i] < X)
				System.out.print(arr[i] + " ");
		}
	}
}
