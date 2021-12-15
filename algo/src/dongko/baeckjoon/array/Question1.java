package dongko.baeckjoon.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/*
 * N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * */

public class Question1 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int N = parse(br.readLine());
			List<Integer> list = new ArrayList<>();
			for (String num : br.readLine().split(" ")) {
				list.add(parse(num));
			}
			int min = list.get(0), max = list.get(0);
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i) < min)
					min = list.get(i);
				if (list.get(i) > max)
					max = list.get(i);
			}
			bw.write(min + " " + max);
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
