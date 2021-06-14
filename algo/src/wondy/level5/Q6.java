package wondy.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String sarr[] = new String[Integer.parseInt(br.readLine())];
		
		for(int i = 0; i < sarr.length; i++) {
			sarr[i] = br.readLine();			
		}
		
		for(int i = 0; i < sarr.length; i++) {
			int cnt = 0, sum = 0;
			
			for(int j = 0; j < sarr[i].length(); j++) {
				if(sarr[i].charAt(j) == 'O' ) {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}

}
