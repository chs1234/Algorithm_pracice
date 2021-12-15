package dongko.baeckjoon.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
/*
	문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
	즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
	S에는 QR Code "alphanumeric" 문자만 들어있다.
	QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
*/
public class Question4 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int t = Integer.parseInt(br.readLine());
			List<String> list = new ArrayList<String>();
			for(int i = 0; i < t; i++) {
				list.add(br.readLine());
			}
			
			for(String str : list) {
				int r = Integer.parseInt(str.split(" ")[0]);
				String s = str.split(" ")[1];
				
				for(int i = 0; i < s.length(); i++) {
					for(int j = 0; j < r; j++) {
						bw.write(s.charAt(i));
					}
				}
				bw.write("\n");
			}
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
