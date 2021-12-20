package dongko.programmers.level1;

/**
 * @title 없는 숫자 더하기
 * @author dhkim
 * @date 2021. 12. 20.
 * @link https://programmers.co.kr/learn/courses/30/lessons/86051
 */
public class PlusNonExtNum {

	public static void main(String[] args) {
		new Solution().solution(null);
	}
	
	static class Solution {
	    public int solution(int[] numbers) {
	        int max = 10 * (0 + 9) / 2;
	        int sum = 0;
	        for(int num : numbers) {
	            sum += num;    
	        }
	        
	        // int answer = -1;
	        return max -sum;
	    }
	}
}
