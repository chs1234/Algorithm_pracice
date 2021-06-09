package wondy.level2;

import java.util.Scanner;

public class Q5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m < 45) {
			if(h == 0) h = 24;
			System.out.println((h - 1) + " " + (m + 60 - 45));
		} else {
			System.out.println(h + " " + (m - 45));		
		}
	}

}
