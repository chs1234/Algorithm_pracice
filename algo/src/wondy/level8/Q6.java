package wondy.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
 
		for (int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(rf(k, n)).append('\n');
		}
		System.out.println(sb);
	}
	
	public static int rf(int k, int n) {
		if(n == 0) return 0;
		else if(k == 0) return n;
		else return rf(k, n - 1) + rf(k - 1, n);
	}

}
