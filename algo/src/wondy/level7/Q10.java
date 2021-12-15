package wondy.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt = n;
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			
			for(int j = 1; j < str.length(); j++) {
				/*
				 * indexOf는 알파벳이 문자열에서 제일 먼저 나온 위치를 알려주기 때문에 
				 * 조건문에서 index가 더 크다면 이미 등장한 알파벳이 다시 등장한 것
				 */
				if(str.indexOf(str.charAt(j - 1)) > str.indexOf(str.charAt(j))) {
					cnt--;
					break;
				}
			}
			
		}
		
		System.out.println(cnt);
	}

}
