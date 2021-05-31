package seung.conditional;

import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.05
 */
public class Exam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		a = sc.nextInt();
		if (!(a >= 0 && a <= 100)) return;
		
		if (90 <= a && a <= 100) {
			System.out.println("A" + a);
		} else if (80 <= a && a <= 89) {
			System.out.println("B" + a);
		} else if (70 <= a && a <= 79) { 
			System.out.println("C" + a);
		} else if (60 <= a && a <= 69) {
			System.out.println("D" + a);
		} else {
			System.out.println("F" + a);
		}
		
//		switch (a/10) {
//			case 6: System.out.println("D"); break;
//			case 7: System.out.println("C"); break;
//			case 8: System.out.println("B"); break;
//			case 9: System.out.println("A"); break;
//	
//			default: System.out.println("F"); break;
//		}
	}
}
