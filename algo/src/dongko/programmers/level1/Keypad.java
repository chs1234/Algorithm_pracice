package dongko.programmers.level1;

import java.util.ArrayList;

/**
 * @title 키패드   
 * @author dhkim
 * @date 2021. 12. 21.
 * @link https://programmers.co.kr/learn/courses/30/lessons/67256
 */
public class Keypad {

	class Solution {
	    int lp = 10, rp = 12;
	    String handG = "";
	    public String solution(int[] numbers, String hand) {
	        String answer = "";
	        handG = hand;
	        for(int n = 0; n < numbers.length; n++) {
	            int num = numbers[n] == 0?11:numbers[n];
	            
	            if(isLeft(num)) {
	                answer += "L";
	                lp = num;
	            } else if (isRight(num)) {
	                answer += "R";
	                rp = num;
	            } else {
	                answer += isIn(num);
	            }
	        }
	        return answer;
	    }
	               
	    String isIn(int num) {
	        String answer = "";
	        boolean isLeft = false, isRight = false;
	        int cnt = 0;
	        
	        while(!isLeft && !isRight) {
	            
	            ArrayList<Integer> distList = getDistList(cnt, num);
	            // System.out.println("num : " + num + " distList" + distList.toString() + " cnt : " + cnt + " contains lp : " + lp + " / " + distList.contains(lp));
	            // System.out.println("num : " + num + " distList" + distList.toString() + " cnt : " + cnt + " contains rp : " + rp + " / " + distList.contains(rp));

	            isLeft = distList.contains(lp);
	            isRight = distList.contains(rp);

	            if(isLeft && isRight) {
	                if(handG.equals("right")) {
	                    rp = num;
	                    answer = "R";
	                } else {
	                    lp = num;
	                    answer = "L";
	                }
	            } else if(isLeft) {
	                lp = num;
	                answer = "L";
	            } else if(isRight) {
	                rp = num;
	                answer = "R";
	            }
	            cnt++;
	        }
	        
	        
	        return answer;
	    }
	    ArrayList<Integer> getDistList(int cnt, int num) {
	        ArrayList<Integer> result = new ArrayList<> ();
	        if(cnt == 1) {
	            result.add(num-3);
	            result.add(num-1);
	            result.add(num+1);
	            result.add(num+3);
	        } else if(cnt == 2) {
	            result.add(num-6);
	            result.add(num-4);
	            result.add(num-2);
	            result.add(num+2);
	            result.add(num+4);
	            result.add(num+6);
	        } else if(cnt == 3 ) {
	            result.add(num-9);
	            result.add(num-7);
	            result.add(num-5);
	            result.add(num+5);
	            result.add(num+7);
	            result.add(num+9);
	        } else if(cnt == 4) {
	            result.add(num-10);
	            result.add(num-8);
	            result.add(num+8);
	            result.add(num+10);
	        } else if(cnt == 0) {
	            result.add(num);
	        }
	        return result;
	    }
	    
	    boolean isLeft(int n) {
	        if(n == 1 || n == 4 || n == 7) return true;
	        return false;
	    }
	    boolean isRight(int n) {
	        if(n == 3 || n == 6 || n == 9) return true;
	        return false;
	        
	    }
	}
}
