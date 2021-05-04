package seung.ioCalc;

import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.04
 */
public class MultiplicationUpgrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, lastIndexValueOfB;
		String b;
		String[] numberArr;
		
		a = sc.nextInt();	
		b = sc.next();
		numberArr = b.split("");
		
		for (int i = 0; i < numberArr.length; i++) {
			lastIndexValueOfB = Integer.parseInt(numberArr[numberArr.length - 1 - i]);
			System.out.println(a * lastIndexValueOfB);
		}
		
		System.out.println(a * Integer.parseInt(b));
	}
}
