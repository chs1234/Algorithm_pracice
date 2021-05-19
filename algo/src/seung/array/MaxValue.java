package seung.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author seung
 * @since 2021.05.19
 */
public class MaxValue {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;
		int idx = 0;
		
		for (int i = 0; i < 9; i++) {
			int val = Integer.parseInt(br.readLine());
			
			if (val > max) {
				max = val;
				idx = i + 1;
			}
		}
		br.close();
		System.out.println(max);
		System.out.println(idx);
	}
}
