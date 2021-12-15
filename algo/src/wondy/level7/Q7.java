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
		 * StringBuilder는 문자열을 다루는 클래스로 reverse()라는 메소드를 포함하고 있다. 
		 * StringBuilder에 넣어주려는 인자가 String 타입일 경우 append()를 사용할 필요가 없다. 
		 * (int 타입는 append() 메소드 사용해야함)
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
