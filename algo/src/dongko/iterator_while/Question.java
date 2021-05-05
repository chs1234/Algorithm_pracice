package dongko.iterator_while;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Question {
	
	
	public static void main(String [] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String line = br.readLine();
			List<Integer> list = new ArrayList<Integer> ();
			while(!(line.split(" ")[0].equals("0") 
					&& line.split(" ")[1].equals("0"))) {
				list.add(parse(line.split(" ")[0]) + parse(line.split(" ")[1]));
				line = br.readLine();
			}
			for(int num : list) {
				bw.write(num + "\n");
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
