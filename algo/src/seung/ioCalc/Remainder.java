package seung.ioCalc;

import java.util.Scanner;

/**
 * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
 * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 * 
 * @author seung
 * @since 2021.05.04
 */
public class Remainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		a = sc.nextInt();	
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println((a + b) % c);
		System.out.println(((a%c) + (b%c)) % c);
		System.out.println((a * b) % c);
		System.out.println(((a%c) * (b%c)) % c);
	}
}