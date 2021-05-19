package dongko.basicMath1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 *�� ���� �����̰� �ִ�. �� �����̴� ���̰� V������ ���� ���븦 �ö� ���̴�.
 *�����̴� ���� A���� �ö� �� �ִ�. ������, �㿡 ���� �ڴ� ���� B���� �̲�������. 
 *��, ���� �ö� �Ŀ��� �̲������� �ʴ´�.
 *�����̰� ���� ���븦 ��� �ö󰡷���, ��ĥ�� �ɸ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. */
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
