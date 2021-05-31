package seung.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.19
 */
public class MinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[N-1]);
	}
}
