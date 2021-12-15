package dongko.iterator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Question11 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			String nx = br.readLine();
			int N = parse(nx.split(" ")[0]);
			int X = parse(nx.split(" ")[1]);
			
			String [] arrStr = br.readLine().split(" ");
			
			for(String str : arrStr) {
				if(parse(str) < X) bw.write(str + " ");
			}
			
			
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
