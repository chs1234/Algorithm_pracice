package dongko.baeckjoon.function;

public class Question1 {

	public static void main(String [] args) {
		int [] a =  {1,2,3,4,5,6,7,8,9,10};
		System.out.println(sum(a));
	}
	
	static long sum(int[] a) {
        long ans = 0;
        for(int i = 0; i < a.length; i++) ans += a[i];
        return ans;
    }
}
