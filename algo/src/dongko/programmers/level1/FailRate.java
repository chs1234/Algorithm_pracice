package dongko.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

/**
 * @title 실패율  
 * @author dhkim
 * @date 2021. 12. 21.
 * @link https://programmers.co.kr/learn/courses/30/lessons/42889
 */
public class FailRate {

	class Solution {
	    public int[] solution(int N, int[] stages) {
	        LinkedHashMap<Integer, Double> stgMap = new LinkedHashMap<> ();
	        
	        for(int stage = 1; stage <= N; stage++) {
	            int spCnt = 0, spNotCnt = 0;
	            
	            for(int i = 0; i < stages.length; i++) {
	                if(stages[i] > stage) {
	                    spCnt++;
	                } else if(stages[i] == stage){
	                    spCnt++;
	                    spNotCnt++;
	                }
	            }
	            
	            stgMap.put(stage, (spCnt == 0)?0.0:(double)spNotCnt / spCnt);
	        }
	        
	        ArrayList<Integer> keyList = new ArrayList<> (stgMap.keySet());
	        Collections.sort(keyList, (k1, k2) -> (stgMap.get(k2).compareTo(stgMap.get(k1))));
	        
	        int[] answer = new int [keyList.size()];
	        int p = 0;
	        for(int k : keyList) {
	            answer[p++] = k;
	        }
	        
	        return answer;
	    }
	}
}
