package seung.conditional;

import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.05
 */
public class Quadrants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, m;
		
		h = sc.nextInt();
		m = sc.nextInt();
		
		if (!(0 <= h && h <= 23)) return;		
		if (!(0 <= m && m <= 59)) return;
		
		if (m < 45) {
			if (h == 0) h = 24;
			
			h = h - 1;
			m = 15 + m;
		} else {
			m = m - 45;
		}
		
		System.out.println(h + " " + m);
	}
}
