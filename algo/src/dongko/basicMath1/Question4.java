package dongko.basicMath1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 *땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
 *달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 
 *또, 정상에 올라간 후에는 미끄러지지 않는다.
 *달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오. */
public class Question4 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String line = br.readLine();
			int a = Integer.parseInt(line.split(" ")[0]);
			int b = Integer.parseInt(line.split(" ")[1]);
			int v = Integer.parseInt(line.split(" ")[2]);
			
			int dayCnt = 0;
			//5 3 10
			// x = 10 -5 / 5 - 3 => 5 / 2 = 2
			
			//5 1 6
			//x = 6 - 5 / 5 -1 -> 1 / 4 = 0
			int x = (v - a) / (a-b);
			int modX = (v - a) % (a-b);
			dayCnt = x + 1;
			
//			System.out.println(dayCnt);
//			System.out.println(currH);
//			System.out.println(modX);
			
			if(modX == 1) {
				dayCnt ++;
			}
			
			System.out.println(dayCnt);
//			while(true) {
//				dayCnt ++;
//				currH += a;
//				
//				if(currH >= v) break;
//				currH -= b;
//			}
			bw.write(dayCnt + "\n");
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
