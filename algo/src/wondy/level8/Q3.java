package wondy.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		int line = 0;
		int cnt = 0;
		
		while(true) {
			line++;
			cnt += line;
			
			if(cnt >= x) {
				if(line % 2 == 0) {
					System.out.println((x - cnt + line) + "/" + (cnt - x + 1));
				} else {
					System.out.println((cnt - x + 1) + "/" + (x - cnt + line));
				}
				break;
			}
		}
	}

}
