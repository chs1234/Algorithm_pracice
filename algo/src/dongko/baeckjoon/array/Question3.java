package dongko.baeckjoon.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

	예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다 */
public class Question3 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int A = parse(br.readLine());
			int B = parse(br.readLine());
			int C = parse(br.readLine());
			
			String mulNum = A * B * C + "";
			Map<String, Integer> map = new HashMap<>();
			String digit = "";
			for(int i = 0; i < mulNum.length(); i++) {
				digit = mulNum.charAt(i) + "";
				if(map.get(digit) == null) {
					map.put(digit, 0);
				}
				
				map.put(digit, map.get(digit) + 1);
			}
			
			for(int i = 0; i < 10; i++) {
				int result = 0;
				if(map.get(i + "") != null) {
					result = map.get(i + "");
				}
				bw.write(result + "\n");
			}

			br.close();
			bw.flush();
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static int parse(String str) {
		return Integer.parseInt(str);
	}

}
