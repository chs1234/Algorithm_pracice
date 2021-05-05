package dongko.iterator_while;

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
			String originNum = (parse(n) < 10)?("0" + n):n;
			String newNum = "";
			int cnt = 0;
			while(!originNum.equals(newNum)) {
				cnt ++;
				String digit1 = "", digit10 = "";
				
				digit10 = (n.length() > 1)?(n.substring(0, 1)):("0");
				digit1 = n.substring(n.length() -1);
				
				int digitSum = parse(digit10) + parse(digit1);
				String digitSumLastChar = (digitSum + "").substring((digitSum + "").length() -1);
				newNum = digit1 + digitSumLastChar;
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
}
