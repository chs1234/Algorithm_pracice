package wondy.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		/*
		 * StringBuilder�� ���ڿ��� �ٷ�� Ŭ������ reverse()��� �޼ҵ带 �����ϰ� �ִ�. 
		 * StringBuilder�� �־��ַ��� ���ڰ� String Ÿ���� ��� append()�� ����� �ʿ䰡 ����. 
		 * (int Ÿ�Դ� append() �޼ҵ� ����ؾ���)
		 */
		int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()); 
		int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()); 
		
		/*
		 * int a = Integer.parseInt(st.nextToken()); 
		 * int b = Integer.parseInt(st.nextToken());
		 * a = ((a % 10) * 100) + (((a / 10) % 10) * 10) + (a / 100); 
		 * b = ((b % 10) * 100) + (((b / 10) % 10) * 10) + (b / 100);
		 */
		
		System.out.println(a > b ? a : b);
	}

}
