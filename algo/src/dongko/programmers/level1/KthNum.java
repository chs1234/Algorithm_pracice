package dongko.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;


/**
 * @title K번째 수
 * @author dhkim
 * @date 2021. 12. 20.
 * @link https://programmers.co.kr/learn/courses/30/lessons/42748?language=java
 */
public class KthNum {

	//Arrays.sort, Arrays.copyOfRange 참고
	public static void main(String[] args) {
		new Solution().solution(null, null);
	}
	
	static class Solution {
	    public int[] solution(int[] array, int[][] commands) {
	        
	        int[] answer = new int [commands.length];
	        for (int i = 0; i < commands.length; i++) {  
	            
	            ArrayList<Integer> arr = new ArrayList<> ();
	            
	            for( int k = commands[i][0]-1; k <= commands[i][1]-1; k++) {
	                arr.add(array[k]);
	            }
	            
	            Collections.sort(arr);
	            answer[i] = arr.get(commands[i][2]-1);
	        }
	        
	        return answer;
	    }
	}
}
