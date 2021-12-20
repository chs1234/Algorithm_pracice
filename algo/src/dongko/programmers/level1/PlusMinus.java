package dongko.programmers.level1;

/**
 * @title 음양 더하기
 * @author dhkim
 * @date 2021. 12. 20.
 * @link https://programmers.co.kr/learn/courses/30/lessons/76501
 */
public class PlusMinus {

	public static void main(String[] args) {
		new Solution().solution(null, null);
	}
	
	static class Solution {
	    public int solution(int[] absolutes, boolean[] signs) {
	        int answer = 0;
	    
	        for(int i = 0; i < absolutes.length; i++) {
	            answer += (signs[i] == true?1:-1) * absolutes[i];
	        }
	        return answer;
	    }
	}
}
