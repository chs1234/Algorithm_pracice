package dongko.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GymSuit {

	class Solution {
	    public int solution(int n, int[] lost, int[] reserve) {
	        HashMap<Integer, String> statMap = new HashMap<> ();
	        
	        for(int i = 0; i < lost.length; i++) {
	            statMap.put(lost[i], "L");
	        }
	        
	        for(int i = 0; i < reserve.length; i++) {
	            statMap.put(reserve[i], "R");
	        }
	        
	        for(int i = 0; i < n; i++) {
	            int num = i+1;
	            boolean isLost = Arrays.stream(lost).anyMatch(nu -> nu == num);
	            boolean isReserve = Arrays.stream(reserve).anyMatch(nu -> nu == num);
	            if((isLost && isReserve)) statMap.put(num, "N");
	            
	            if(statMap.get(num) == null) statMap.put(num, "N");
	        }
	        
	        int cnt = 0;
	        List<Integer> keySet = new ArrayList<>(statMap.keySet());
	        for (int key : keySet) {
	            String stat = statMap.get(key);
	            
	            if(stat.equals("L")) {
	                boolean isFirst = false, isLast = false;
	                if(key == 1) isFirst = true;
	                if(key == n) isLast = true; 
	                
	                if(!isFirst && "R".equals(statMap.get(key-1))) {
	                    statMap.put(key, "N");
	                    statMap.put(key-1, "N");
	                } else if (!isLast && "R".equals(statMap.get(key+1))) {
	                    statMap.put(key, "N");
	                    statMap.put(key+1, "N");
	                }
	            }
	            
	            if(statMap.get(key).equals("N") || statMap.get(key).equals("R")) cnt++;
	        }
	        
	        return cnt;
	    }
	}
}
