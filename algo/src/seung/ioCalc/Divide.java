package seung.ioCalc;

import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.04
 */
public class Divide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b;
		
		a = sc.nextDouble();	
		b = sc.nextDouble();
		System.out.println(a / b);
	}
}
