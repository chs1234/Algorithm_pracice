package dongko.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
/*
	알파벳 소문자로만 이루어진 단어 S가 주어진다. 
	각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
	포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
*/
public class Question3 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = br.readLine();
			Map<Integer, Integer> map = new HashMap<> ();
			for(int i = 0; i < s.length(); i++) {
				int a = s.charAt(i) + 0;
				
				if(a >= 97 && a <= 122) {
					if(map.get(a) == null)
						map.put(a, i);
				}
			}
			
			for(int i = 97; i <= 122; i++) {
				if(map.get(i) != null) {
					System.out.print(map.get(i) + " ");
				} else {
					System.out.print(-1 + " ");
				}
			}
			
		
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
