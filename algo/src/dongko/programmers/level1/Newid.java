package dongko.programmers.level1;

/**
 * @title 신규 아이디 추천
 * @author dhkim
 * @date 2021. 12. 17.
 * @link https://programmers.co.kr/learn/courses/30/lessons/72410
 */
public class Newid {

	//정규 표현식으로 바꿔보면 좋을 것 같다
	public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        
        String ascFiltered = "";
        
        for(int i = 0; i < new_id.length(); i++) {
            char ch = new_id.charAt(i);
            int asc = ch;
            
            if(
                ((asc >= 97 && asc <= 122) ||
                 (asc >= 48 && asc <= 57) ||
                (asc == 45 || asc == 46 || asc == 95)) 
            ) {
                ascFiltered += ch;
            }
        }
        
        char prv = 'p';
        String fst = "";
        for(int i = 0; i < ascFiltered.length(); i++) {
            char ch = ascFiltered.charAt(i);
            
            if( (ch == '.' && prv != '.') || ch != '.') {
                fst += ch;
            }
            prv = ch;
        }
        
        if(fst.length() > 1) {
            if(fst.substring(0, 1).equals(".")) fst = fst.substring(1, fst.length());
            if(fst.substring(fst.length() - 1).equals(".")) fst = fst.substring(0, fst.length()-1);    
        } else if(fst.length() == 1) {
            if(fst.charAt(0) == '.') fst = "";
        } 
        
        if(fst.length() == 0) {
            fst = "a";
        } else if(fst.length() >= 16) {
            fst = fst.substring(0, 15);
            
            if(fst.substring(fst.length()-1).equals("."))
                fst = fst.substring(0, fst.length()-1);
        }
        
        if(fst.length() <= 2) {
            while(fst.length() <= 2) {
                fst += fst.substring(fst.length()-1);
            }
        }
        
        String answer = fst;
        return answer;
    }
}
