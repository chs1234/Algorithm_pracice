package wondy.level1;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		/*
		 * ù° �ٿ� A/B�� ����Ѵ�. ���� ����� ��°��� ������� �Ǵ� �������� 10-9 �����̸� �����̴�.
		 * 
		 * float�� ������ : 10^-7, double �� ������ : 10^-15
		 * */
		System.out.print((double) a / b);
	}

}
