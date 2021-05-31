package seung.array;

import java.util.Scanner;

/**
 * @author seung
 */
public class NumOfNums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		String str = Integer.toString(value);
		sc.close();
		
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				// charAt() -> char 타입을 리턴.
				// int 형으로 변환 시, 아스키코드값 48이 더해진다.
				// 그러므로, 본래의 값을 제대로 가지고 오기 위해서 아스키코드값이 48인 '0'을 빼주어야함.
				// cf) '0'을 빼주든지, 정수 48을 빼주든지.
				if ((str.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
