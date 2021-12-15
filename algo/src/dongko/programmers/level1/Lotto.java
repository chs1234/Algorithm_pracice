package dongko.programmers.level1;

/**
 * @title 로또의 최고 순위와 최저 순위
 * @author dhkim
 * @date 2021. 12. 15. 
 * @link https://programmers.co.kr/learn/courses/30/lessons/77484
 */
public class Lotto {

	public int[] solution(int[] lottos, int[] win_nums) {
        boolean isZeroContained = isZeroContained(lottos);
        int[] answer = new int [2];
        
        int cnt = getFitCnt(lottos, win_nums);
        int minRank = getRankByCnt(cnt);
        
        if(true == isZeroContained) {
            //0포함
            int zeroCnt = getZeroCnt(lottos);
            int maxRank = getRankByCnt(cnt + zeroCnt);
            
            answer[0] = maxRank;
            answer[1] = minRank;
        } else {
            //0미포함
            answer[0] = minRank;
            answer[1] = minRank;
        }
        return answer;
    }
    
    boolean isZeroContained(int [] lottos) {
        boolean result = false;
        for(int num : lottos) {
            if(num == 0) {
                result = true;
                break;
            }
        }
        return result;
    }
    
    int getFitCnt(int [] lottos, int [] win_nums) {
        int cnt = 0;
        for(int i = 0; i < lottos.length; i++) {
            for(int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
    
    int getRankByCnt(int cnt) {
        int rank = 0;
        switch(cnt) {
            case 2 : rank = 5; break;
            case 3 : rank = 4; break;
            case 4 : rank = 3; break;
            case 5 : rank = 2; break;
            case 6 : rank = 1; break;
            default: rank = 6; 
        }
        return rank;
    }
        
        
    int getZeroCnt(int [] lottos) {
        int zeroCnt = 0;
        for(int num : lottos) {
            if(num == 0) zeroCnt++;
        }
        return zeroCnt;
    }
}
