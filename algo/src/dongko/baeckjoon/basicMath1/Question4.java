package dongko.baeckjoon.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
 *달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 
 *또, 정상에 올라간 후에는 미끄러지지 않는다.
 *달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오. */
public class Question4 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String line = br.readLine();
			int a = Integer.parseInt(line.split(" ")[0]);
			int b = Integer.parseInt(line.split(" ")[1]);
			int v = Integer.parseInt(line.split(" ")[2]);
			
			int dayCnt = (v - a) / (a-b) + 1;
			if((v - a) % (a-b) != 0) {
				dayCnt ++;
			}
			System.out.println(dayCnt);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
