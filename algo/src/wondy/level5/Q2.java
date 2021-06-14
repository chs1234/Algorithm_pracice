package wondy.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0, cnt = 0;
		
		for(int i = 1; i <= 9; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n > max) {
				max = n;
				cnt = i;
			}			
		}
		
		br.close();
		System.out.print(max + "\n" + cnt);
	}

}
