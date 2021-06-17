package wondy.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int r = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			String p = "";
			
			for(int j = 0; j < s.length(); j++) {
				for(int k = 0; k < r; k++) {
					p += s.charAt(j);
				}
			}
			
			sb.append(p).append("\n");
		}
		
		System.out.println(sb);
	}

}
