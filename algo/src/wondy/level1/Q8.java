package wondy.level1;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		/*
		 * 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
		 * 
		 * float의 상대오차 : 10^-7, double 의 상대오차 : 10^-15
		 * */
		System.out.print((double) a / b);
	}

}
