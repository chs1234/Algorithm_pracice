package dongko.baeckjoon.iterator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Question10 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int cnt = parse(br.readLine());
			
			
			for(int i = cnt; i > 0; i--) {
				String result = "";
				for(int j = 1; j <= cnt; j++) {
					if(j < i) result += " ";
					else result += "*";
				}
				bw.write(result + "\n");
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
