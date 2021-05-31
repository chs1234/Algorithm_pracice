package dongko.iterator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Question8 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int cnt = parse(br.readLine());
			int nArr[][] = new int[cnt][2];

			for (int i = 0; i < cnt; i++) {
				String line = br.readLine();
				nArr[i][0] = parse(line.split(" ")[0]);
				nArr[i][1] = parse(line.split(" ")[1]);
			}

			for (int i = 0; i < nArr.length; i++) {
				bw.write("Case #" + (i+1) + ": " + nArr[i][0] + " + " + nArr[i][1] + " = " + (nArr[i][0] + nArr[i][1]) + "\n");
			}
			br.close();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int parse(String str) {
		return Integer.parseInt(str);
	}

}
