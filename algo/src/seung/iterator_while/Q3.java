package seung.iterator_while;

import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.16
 */
public class Q3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();        
		int cnt = 0;
		int copiedN = N;
        
		while(true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
 
			if (copiedN == N) break;
		}
		
		System.out.println(cnt);
	}
}
