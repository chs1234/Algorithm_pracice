package wondy.level6;

public class Q2 {
	
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];

		for(int i = 1; i < 10001; i++) {
			int n = d(i);
			
			if(n < 10001) {
				check[n] = true;
			}
		}
		
		for(int i = 1; i < 10001; i++) {
			if(!check[i]) {
				System.out.println(i);
			}
		}
	}
	
	public static int d(int n) {
		int sum = n;
		
		while(n != 0) {
			sum = sum + (n % 10); //첫 째 자리수
			n = n / 10; //0으로 나누면 첫 째 자리가 없어진다.
		}
		
		return sum;
	}

}