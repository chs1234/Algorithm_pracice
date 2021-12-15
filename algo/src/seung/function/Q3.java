package seung.function;

import java.util.Scanner;

/**
 * @author seung
 */
public class Q3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println(arithmetic_sequence(sc.nextInt()));
		sc.close();
    }
    
    public static int arithmetic_sequence(int num) {
        int cnt = 0;
        
        if (num < 100) return num;
        else {
            cnt = 99;
            if (num == 1000) num = 999;
            
            for (int i = 100; i<= num; i++) {
                int hun = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;
                
                if ((hun - ten) == (ten - one)) cnt++;
            }
        }
        
        return cnt;
    }
}
