package dongko.baeckjoon.basicMath1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*遺����쉶�옣�씠 �맆�뀒�빞 */
public class Question6 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {

			int t = Integer.parseInt(br.readLine());

			for (int T = 0; T < t; T++) {
//			String line = br.readLine();
				int k = Integer.parseInt(br.readLine()) + 1;
				int n = Integer.parseInt(br.readLine()) + 1;
				int[][] arr = new int[k][n];

				for (int i = 0; i < k; i++) {
					for (int j = 1; j < n; j++) {

						if (i == 0) {
							arr[i][j] = j;
						} else if (i != 0 && j == 1) {
							arr[i][j] = 1;
						} else {
							int sum = 0;

							for (int x = 1; x <= j; x++) {
								sum += arr[i - 1][x];
							}
							arr[i][j] = sum;
						}
					}
				}
				bw.write(arr[k - 1][n - 1] + "\n");
			}

			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
