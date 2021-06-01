package dongko.basicMath1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/* 큰 수 A+B */
public class Question8 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			String line = br.readLine();
			BigInteger a = new BigInteger(line.split(" ")[0]);
			BigInteger b = new BigInteger(line.split(" ")[1]);
			
			bw.write(a.add(b)+"\n");

			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
