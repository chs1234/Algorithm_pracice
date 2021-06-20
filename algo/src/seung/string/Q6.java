package seung.string;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author seung
 */
public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		
		System.out.println(st.countTokens());
	}
}
