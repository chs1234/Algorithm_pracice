package dongko.programmers.level1;


/** 
 * @title 소수 만들기
 * @author dhkim
 * @date 2021. 12. 20.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12977
 */
public class PrimeNumber {

	public static void main(String[] args) {
		new Solution().solution(null);
	}
	static class Solution {
	    public int solution(int[] nums) {
	        int primeCnt = 0;
	        
	        for (int i = 0; i < nums.length -2; i++) {
	            for(int j = i+1; j < nums.length -1; j++) {
	                for(int k = j+1; k < nums.length; k++) {
	                    int sum = nums[i] + nums[j] + nums[k];
	                    if(isPrime(sum) == true)
	                        primeCnt++;
	                }
	            }
	        }
	        return primeCnt;
	    }
	    
	    boolean isPrime(int num) {
	        boolean isPrime = true;
	        for(int i = 2; i < num; i++) {
	            if(num % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	        return isPrime;
	    }
	}
}
