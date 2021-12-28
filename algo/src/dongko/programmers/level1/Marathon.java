package dongko.programmers.level1;

import java.util.HashMap;

/**
 * @title 완주하지 못한 선수
 * @author dhkim
 * @date 2021. 12. 15.
 * @link https://programmers.co.kr/learn/courses/30/lessons/42576
 */
public class Marathon {
	
	class Solution {
	    public String solution(String[] participant, String[] completion) {
	        HashMap<String, Integer> map = new HashMap<> ();
	        for(String p : participant) {
	            if(map.get(p) == null) map.put(p, 0);
	            map.put(p, map.get(p) + 1);
	        }
	        
	        for(String c : completion) {
	            map.put(c, map.get(c) -1);
	        }
	        
	        String answer = "";
	        for(String key : map.keySet()) {
	            if(map.get(key) == 1) {
	                answer = key;
	                break;
	            }
	        }
	        return answer;
	    }
	}

}
