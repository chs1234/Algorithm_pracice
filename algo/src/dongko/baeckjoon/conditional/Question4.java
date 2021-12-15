package dongko.baeckjoon.conditional;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		int result = 1;

		if ((x < 0) && (y > 0))
			result = 2;
		else if ((x < 0) && (y < 0))
			result = 3;
		else if ((x > 0) && (y < 0))
			result = 4;

		System.out.println(result);
	}

}
