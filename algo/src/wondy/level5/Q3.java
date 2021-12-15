package wondy.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int result = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		
		String str = String.valueOf(result);
		int[] arr = new int[10];
		
		for(int i = 0; i < str.length(); i++) {
			//해당 문자열의 문자 값을 추출하여 int 베열의 index 값을 증가시킨다.
			arr[(str.charAt(i) - '0')]++;
		}
		
		for(int r : arr) {
			System.out.println(r);
		}
	}

}
