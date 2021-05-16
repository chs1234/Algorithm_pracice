package seung.iterator_while;

import java.util.Scanner;

/**
 * @author seung
 * @since 2021.05.16
 * 
 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
 * �Է��� ���������� 0 �� ���� ���´�.
 * 
 * �� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
 */
public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		while (sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			if (a == 0 && b == 0) break;
			
			System.out.println(a + b);
		}
	}
}
