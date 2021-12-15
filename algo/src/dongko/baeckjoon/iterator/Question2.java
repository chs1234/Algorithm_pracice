package dongko.baeckjoon.iterator;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		int nArr [] [] = new int[cnt][2];
		for(int i = 0; i < cnt; i++) {
			nArr[i][0] = sc.nextInt();
			nArr[i][1] = sc.nextInt();
		}
		
		for(int i = 0; i < nArr.length; i++) {
			
			System.out.println(nArr[i][0] + nArr[i][1]);
		}
		
	}

}
