package seung.conditional;

import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.05
 */
public class AlarmClock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x == 0 || !(-1000 <= x && x <= 1000)) return;
		if (y == 0 || !(-1000 <= y && y <= 1000)) return;
		
		if (x > 0 && y > 0) {
			System.out.println("1");
		} else if (x < 0 && y > 0) {
			System.out.println("2");
		} else if (x < 0 && y < 0) {
			System.out.println("3");
		} else if (x > 0 && y < 0) {
			System.out.println("4");
		}
	}
}
