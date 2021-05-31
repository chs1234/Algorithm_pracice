package seung.ioCalc;

import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.04
 */
public class Subtraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		a = sc.nextInt();	
		b = sc.nextInt();
		System.out.println(a - b);
	}
}
