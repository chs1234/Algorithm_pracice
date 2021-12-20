package dongko.programmers.level1;

/**
 * @title
 * @author dhkim
 * @date 2021. 12. 20.
 * @link
 */
public class DotProduct {

	public static void main(String[] args) {
		new Solution().solution(null, null);
	}
	
	static class Solution {
	    public int solution(int[] a, int[] b) {
	        int answer = 0;
	        for(int i = 0; i < a.length; i++) {
	            answer += a[i] * b[i];
	        }
	        
	        return answer;
	    }
	}
}
