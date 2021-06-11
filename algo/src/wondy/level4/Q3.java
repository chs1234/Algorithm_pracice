package wondy.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cp = n;
		int cnt = 0;
		
		do {
			n = ((n % 10) * 10 + ((n / 10) + (n % 10)) % 10);
			
			cnt++;
		} while(n != cp);
		
		System.out.println(cnt);
	}

}
