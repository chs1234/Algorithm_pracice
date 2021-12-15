package dongko.baeckjoon.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/*
 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

	예를 들어, 서로 다른 9개의 자연수
	
	3, 29, 38, 12, 57, 74, 40, 85, 61
	
	이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
 * */

public class Question2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			List<Integer> list = new ArrayList<>();
			int count = 0;
			while (count < 9) {
				list.add(parse(br.readLine()));
				count++;
			}
			int max = list.get(0);
			int number = 0;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) > max) {
					max = list.get(i);
					number = i + 1;
				}
			}
			if (number == 0)
				number = 1;

			bw.write(max + "\n" + number);

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
