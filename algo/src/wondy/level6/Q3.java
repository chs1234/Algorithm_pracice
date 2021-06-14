package wondy.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		br.close();
		System.out.println(ap(n));
	}
	
	public static int ap(int n) {
		int cnt = 0;
		
		// 1~99�� �� �� ��ü�� �����̱� ������ n�� return
		if(n < 100) {
			return n;
		} else {
			cnt = 99;
			
			if(n == 1000) n = 999;

			for(int i = 100; i <= n; i++) {
				int one = i % 10;
				int ten = (i / 10) % 10;
				int hun = i / 100;
				
				//�� �ڸ����� ������ �̷� ��� cnt ��
				if((hun - ten) == (ten - one)) {
					cnt++;
				}
			}
		}
		
		return cnt;
	}

}
