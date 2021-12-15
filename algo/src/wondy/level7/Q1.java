package wondy.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {

	public static void main(String[] args) throws IOException {
		//System.in 은 byte 값으로 문자 한 개만 읽으면서 해당 문자에 대응되는 아스키코드 값을 저장할 수 있다.
		int a = System.in.read();
		System.out.print(a);
		
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * String str = br.readLine();
		 * 
		 * System.out.println((int)str.charAt(0));
		 */
	}

}
