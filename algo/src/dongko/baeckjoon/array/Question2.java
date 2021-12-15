package dongko.baeckjoon.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/*
 * 9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

	���� ���, ���� �ٸ� 9���� �ڿ���
	
	3, 29, 38, 12, 57, 74, 40, 85, 61
	
	�� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.
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
