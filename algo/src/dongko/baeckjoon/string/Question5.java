package dongko.baeckjoon.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
	알파벳 대소문자로 된 단어가 주어지면, 
	이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
	단, 대문자와 소문자를 구분하지 않는다.
*/
public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		Map<Integer, Integer> map = new HashMap<> ();
		int firstKey = 0;
		for(int i = 0; i < str.length(); i++) {
			int key = str.charAt(i) + 0;
			
			if(key >= 97 && key <= 122) {
				key = key -32;
			} 
			
			if(map.get(key) == null) map.put(key, 0);
			map.put(key, map.get(key) + 1);
			if(i ==0) firstKey = key;
		}
		
		int max = map.get(firstKey);
		char maxChar = ' ';
		for(int key : map.keySet()) {
			if(map.get(key) >= max) {
				max = map.get(key);
				maxChar = (char)key;
			}
		}
		
		int maxCnt = 0;
		for(int key : map.keySet()) {
			if(map.get(key) == max) {
				maxCnt ++;
			}
		}
		
		if(maxCnt > 1) System.out.println("?");
		else System.out.println(maxChar);
		
	}

}
