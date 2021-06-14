package seung.function;

/**
 * @author seung
 */
public class Q1 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		long result = sum(arr);
		
		System.out.println(result);
	}
	
	static long sum(int[] a) {
		long sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
}

// 실제 백준 제출 코드
//public class Test {
//	long sum(int[] a) {
//		long sum = 0;
//		
//		for (int i = 0; i < a.length; i++) {
//			sum += a[i];
//		}
//		
//		return sum;
//	}
//}
