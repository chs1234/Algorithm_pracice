package seung.conditional;

import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.05
 */
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		
		year = sc.nextInt();
		if (!(1 <= year && year <= 4000)) return;
		
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
