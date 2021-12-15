package wondy.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 1;
		int range = 2;
		
		if(n == 1) {
			System.out.println(1);
		} else {
			while(range <= n) {
				range = range + (6 * cnt);
				cnt++;
			}
			
			System.out.println(cnt);
		}
	}

}
