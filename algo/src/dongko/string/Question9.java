package dongko.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
	첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
	단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
*/

public class Question9 {

	public static void main(String[] args) {
		//scanner랑 성능차이 두배가 나더라?!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//system.out이 bufferedwriter보다 빠르다?!
		try {
			String line = br.readLine();
			Map<String, Integer> map = new HashMap<>();
			String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
			
			for (int c = 0; c < arr.length; c++) {
				String ca = arr[c];
				map.put(ca, 0);

				int idx = line.indexOf(ca);

				while (idx >= 0) {
					if (!(ca.equals("z=") 
							&& (idx != 0 && line.substring(idx - 1, idx).equals("d")))) {
						map.put(ca, map.get(ca) + 1);
					}

					idx = line.indexOf(ca, idx + 1);
				}
			}

			int cnt = line.length();
			for (String key : map.keySet()) {
				cnt -= key.length() * map.get(key);
				cnt += map.get(key);
			}
			
			System.out.println(cnt);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
