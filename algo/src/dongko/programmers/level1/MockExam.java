package dongko.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MockExam {

	class Solution {
	    public int[] solution(int[] answers) {
	        HashMap<String, Integer> map = new HashMap<> ();
	        map.put("1", 0);
	        map.put("2", 0);
	        map.put("3", 0);
	        int [] p1 = {1,2,3,4,5};
			int [] p2 = {2,1,2,3,2,4,2,5};
			int [] p3 = {3,3,1,1,2,2,4,4,5,5};
	        
	        for( int i = 0; i < answers.length; i++) {
	            
	            if(answers[i] == p1[i % p1.length]) map.put("1", map.get("1") +1);
	            if(answers[i] == p2[i % p2.length]) map.put("2", map.get("2") +1);
	            if(answers[i] == p3[i % p3.length]) map.put("3", map.get("3") +1);
	            
	        }
	        int mx = Math.max(map.get("1"), Math.max(map.get("2"), map.get("3")));
	        
	        List<String> keyList = new ArrayList<> (map.keySet());
	        Collections.sort(keyList, (k1, k2) -> (k1.compareTo(k2)));
	        
	        ArrayList<Integer> result = new ArrayList<> ();
			for(String key : keyList) {
	            if(map.get(key) == mx) result.add(Integer.parseInt(key));
	        }
	        System.out.println(result);
	        int[] answer = new int [result.size()];
	        int size = 0;
	        for(int p : result) {
	            answer[size++] = p;
	        }
	    
	        return answer;
	    }
	}
}
