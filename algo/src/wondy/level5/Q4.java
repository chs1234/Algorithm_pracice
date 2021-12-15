package wondy.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Q4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		HashSet<Integer> hs = new HashSet<Integer>();

		for(int i = 0; i < 10; i++) {
			hs.add(Integer.parseInt(br.readLine()) % 42);
		}

		System.out.println(hs.size());

		/* 236ms - 오래걸림... int[] arr = new int[10];
		 * 
		 * for(int i = 0; i < 10; i++) { arr[i] = Integer.parseInt(br.readLine()) % 42;
		 * }
		 * 
		 * 
		 * arr = Arrays.stream(arr).distinct().toArray();
		 * 
		 * System.out.println(arr.length);
		 */

	}

}
