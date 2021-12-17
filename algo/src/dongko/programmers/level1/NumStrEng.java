package dongko.programmers.level1;

import java.util.HashMap;
import java.util.regex.Pattern;

/**
 * @title 숫자 문자열과 영단어
 * @author dhkim
 * @date 2021. 12. 17.
 * @link https://programmers.co.kr/learn/courses/30/lessons/81301
 */
public class NumStrEng {

		//replaceAll로 간단하게 푸는 방법이 있다
		//빌더 패턴과 정규식을 이용해서 풀이함
		public static void main(String[] args) {
			String s = "one4seveneight";
			solution(s);
			 s = "23four5six7";
			solution(s);
			 s = "2three45sixseven";
			solution(s);
			 s = "123";
			solution(s);
		}
	
		public static int solution(String s) {
			int result = 
					new NumPlayer(s)
						.solution()
						.printResult();
			
			return result;
	    }
	    
	    private static class NumPlayer {
	        private String s;
	        private int result = 0;
	        private HashMap<String, Integer> engMap;
	        
	        public NumPlayer(String s) {
	            this.s = s;
	            engMap = new HashMap<> ();
	            engMap.put("zero", 0);
	            engMap.put("one", 1);
	            engMap.put("two", 2);
	            engMap.put("three", 3);
	            engMap.put("four", 4);
	            engMap.put("five", 5);
	            engMap.put("six", 6);
	            engMap.put("seven", 7);
	            engMap.put("eight", 8);
	            engMap.put("nine", 9);
	        }
	        
	        private NumPlayer solution() {
	        	String result = "";
	            String regex = "[^0-9]";
		            
	            String engKey = "";
	            for(int i = 0; i < s.length(); i++) {
	                String ch = s.charAt(i)+"";
	                boolean match = Pattern.matches(regex, ch);
	                
	                if(true == match) {
	                    engKey += ch;
	                    Integer num = engMap.get(engKey);
	                    
	                    if(null != num) {
	                        result += num +"";
	                        engKey = "";
	                    }
	                } else {
	                    result += ch;
	                }
	            }
	            this.result = Integer.parseInt(result);
	            return this;
	        }
	        
	        public int printResult() {
	            return result;
	        }
	}
}
