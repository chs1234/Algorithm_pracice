package wondy.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("c= c- dz= d- lj nj s= z="," ");
		
		String str = br.readLine();
		
		while(st.hasMoreTokens()) {
			str = str.replace(st.nextToken(), "0");
		}
		
		System.out.println(str.length());
	}

}