package seung.ioCalc;

import java.util.Scanner;

/**
 * (A+B)%C�� ((A%C) + (B%C))%C �� ������?
 * (A��B)%C�� ((A%C) �� (B%C))%C �� ������?
 * �� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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