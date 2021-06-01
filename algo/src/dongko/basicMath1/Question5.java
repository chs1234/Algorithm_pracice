package dongko.basicMath1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*ACM 호텔 */
public class Question5 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			int t = Integer.parseInt(br.readLine());
			
			for(int T = 0; T < t; T++) {
				String line = br.readLine();
				int h = Integer.parseInt(line.split(" ")[0]);
				int w = Integer.parseInt(line.split(" ")[1]);
				int n = Integer.parseInt(line.split(" ")[2]);
				
				int result  = 0;
				if(n <= h) {
					result = n * 100 + 1;
				} else if(n > h){
					int q = 0;
					int r = 0;
					if(h == 1) {
						result = 100 + n;
					} else {
						q = n / h;
						r = n % h;
						
						result = r * 100 + (q + 1);
                        
                        if(r == 0) {
					        result = h * 100 + q;
			        	}
					}
					
					if(n == h * w) result = h * 100 + w;
					
				}
				
				bw.write(result + "\n");
			}
			
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
