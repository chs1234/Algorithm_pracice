package dongko.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
	그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
	예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
	aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
	단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
*/

public class Question10 {

	public static void main(String[] args) {
		//scanner랑 성능차이 두배가 나더라?!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			int cnt = 0;
			
			for(int i = 0; i < n; i++) {
				String line = br.readLine();
				Map<String, ArrayList<Integer>> map = new HashMap<>();
				
				//입력받은 문자열 순회
				for(int c = 0; c < line.length(); c++) {
					
					//각 알파벳 별로 위치한 인덱스를 담은 배열을 map에 넣는다
					// aabbcc : {{a : [0, 1]}. {b : [2, 3]}, {c : [4,5]}}
					if(map.get(line.charAt(c) + "") == null) {
						ArrayList<Integer> tmpList = new ArrayList<>();
						map.put(line.charAt(c) + "", tmpList);
					}
					
					map.get(line.charAt(c) + "").add(c);
				}
				
				boolean isGrpNum = true;
				//문자 하나마다 검사
				for(String key : map.keySet()) {
					ArrayList<Integer> idxList = map.get(key);
					
					//배열 길이가 1이면 검사 불필요
					if(idxList.size() > 1) {
						
						//각 인덱스와 그 앞 인덱스를 비교 => 1부터 시작
						for(int idx = 1; idx < idxList.size(); idx++) {
							
							//둘의 차이가 1보다 크다면? => 둘이 떨어져있다는 뜻 
							//ex) (aba) => a : [0, 2]
							if(idxList.get(idx) - idxList.get(idx - 1) > 1) {
								isGrpNum = false;
								//하나라도 인접안해있으면 더 볼필요 없음
								break;
							}
						}
						
					} 
					
				}
				
				//여기가 cnt++ 지점
				if(isGrpNum) cnt++;
			}
			System.out.println(cnt);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
