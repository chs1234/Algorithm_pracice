package dongko.baeckjoon.iterator_while;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Question2 {
	
	
	public static void main(String [] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String line = "";
			while((line = br.readLine()) != null) {
				if(line.length() == 0) break;
				int A = parse(line.split(" ")[0]);
				int B = parse(line.split(" ")[1]);
				bw.write( A + B + "\n");
			}
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
