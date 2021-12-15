package wondy.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt = n;
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			
			for(int j = 1; j < str.length(); j++) {
				/*
				 * indexOf�� ���ĺ��� ���ڿ����� ���� ���� ���� ��ġ�� �˷��ֱ� ������ 
				 * ���ǹ����� index�� �� ũ�ٸ� �̹� ������ ���ĺ��� �ٽ� ������ ��
				 */
				if(str.indexOf(str.charAt(j - 1)) > str.indexOf(str.charAt(j))) {
					cnt--;
					break;
				}
			}
			
		}
		
		System.out.println(cnt);
	}

}
