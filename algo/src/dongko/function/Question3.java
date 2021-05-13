package dongko.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. */

public class Question3 {

	public static void main(String [] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			System.out.println(countHansu(n));
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	static int countHansu(int n) {
		int cnt = 0;
		
		for(int i = 1; i <= n; i++) {
			
			if(i < 10) {
				cnt++;
				continue;
			}
			
			String iStr = i + "";
			int d = Integer.parseInt(iStr.charAt(0) + "") - Integer.parseInt(iStr.charAt(1) + "");
			boolean isHansu = true;
			
			for(int j = 1; j < iStr.length(); j++) {
				if((Integer.parseInt(iStr.charAt(j-1) + "") 
						- Integer.parseInt(iStr.charAt(j) + "")) != d) {
					isHansu = false;
					break;
				}
			}
			
			if(isHansu) cnt ++;
		}
		
		return cnt;
	}
	
	
}
