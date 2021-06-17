package wondy.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().toUpperCase();
		int[] arr = new int[26];
		
		// 아스키코드 A = 65, a = 97
		for(int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 65]++;
		}
		
		int max = -1;
		char c = '?';
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				c = (char)(i + 65);
			} else if(arr[i] == max) {
				c = '?';
			}
		}
		
		System.out.println(c);
	}

}
