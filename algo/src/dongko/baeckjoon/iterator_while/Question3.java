package dongko.baeckjoon.iterator_while;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Question3 {
	
	
	public static void main(String [] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String n = br.readLine();
			String originNum = (is1Digit(n))?("0" + n):n;
			String newNum = "";
			int cnt = 0;
			while(!originNum.equals(newNum)) {
				cnt ++;
				String digit1 = "", digit10 = "";
				
				digit10 = (is1Digit(n))?("0"):(firstChar(n));
				digit1 = lastChar(n);
				
				int digitSum = parse(digit10) + parse(digit1);
				newNum = digit1 + lastChar(digitSum + "");
				n = newNum;
			}
			
			bw.write(cnt + "\n");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int parse(String str) {
		return Integer.parseInt(str);
	}
	public static String lastChar(String str) {
		return str.substring(str.length() - 1);
	}
	public static String firstChar(String str) {
		return str.substring(0, 1);
	}
	public static boolean is1Digit(Object param) {
		boolean result = true;
		
		if( param instanceof String 
				&& !(((String) param).length() < 2)) {
			result = false;
		} else if( param instanceof Integer 
				&& (Integer)param >= 10) {
			result = false;
		}
		return result;
	}
}
