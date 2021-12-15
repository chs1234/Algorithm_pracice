package seung.string;

import java.util.Scanner;
/**
 * @author seung
 */
public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		String s = sc.next();
		
		for (int i = 0; i < s.length(); i++) {
			if (65 <= s.charAt(i) && s.charAt(i) <= 90) {
				arr[s.charAt(i) - 'A']++;
			} else {
				arr[s.charAt(i) - 'a']++;
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65);
			} 
			else if (arr[i] == max) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
	}
}
