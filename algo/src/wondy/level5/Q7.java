package wondy.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7 {

	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());		
		int[] arr;
		
		for(int i = 0; i < t; i++) {
			st  = new StringTokenizer(br.readLine(), " ");
			
			int sn = Integer.parseInt(st.nextToken()); //학생 수
			
			arr = new int[sn];
			
			double sum = 0;
			
			for(int j = 0; j < sn; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			
			double avg = sum / sn;
			double cnt = 0;
			
			for(int j = 0; j < sn; j++) {
				if(arr[j] > avg) {
					cnt++;
				}
			}
			
			System.out.printf("%.3f%%\n", cnt / sn * 100);
		}
	}

}
