package dongko.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 
 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
 
 */
public class Question7 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int C = parse(br.readLine());
			int count = 0;
			List<String> list = new ArrayList<>();
			while(count < C) {
				count++;
				list.add(br.readLine());
			}
			for(String str : list) {
				String [] arr = str.split(" ");
				int N = parse(arr[0]);
				int sum = 0;
				
				for(int i = 1; i < arr.length; i++) {
					sum += parse(arr[i]);
				}
				
				int avg = sum / N;
				double avgCnt = 0;
				for(int i = 1; i < arr.length; i++) {
					if(parse(arr[i]) > avg) {
						avgCnt++;
					}
				}
				
				System.out.printf("%.3f%%\n",(avgCnt/N)*100);
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static int parse(String str) {
		return Integer.parseInt(str);
	}

}
