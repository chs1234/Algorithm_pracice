package dongko.basicMath1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*설탕 배달*/
public class Question7 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int n = Integer.parseInt(br.readLine());
			int result = -1;
			
			if( n > 10 ) {
				
				if(n % 5 == 0) result = n / 5;
				else {
					int mod = n % 5;
					
					int temp = n;
					int r = 0;
					
					while(temp % 5 != 0) {
						temp++;
					}
					
					r = temp / 5;
					
					if(mod == 1 || mod == 3) {
						result = r;
					} else {
						result = r + 1;
					}
				}
				
			} else {
				switch(n) {
				case 3 : result = 1; break;
				case 5 : result = 1; break;
				case 6 : result = 2; break;
				case 8 : result = 2; break;
				case 9 : result = 3; break;
				case 10 : result = 2; break;
				}
			}

			bw.write(result + "\n");
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
