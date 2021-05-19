package dongko.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 
 *과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 *X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오 */
public class Question3 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
//			int n = Integer.parseInt(br.readLine());
			
			int pointer = 1;
//			for(int row = 1; row< 100; row++) {
//				
//				for(int col= 1; col< 100; col++) {
//					System.out.print(row + "/" + col + " ");
//				}
//				System.out.println();
//			}
			int cnt = 1;
			int row = 1, col = 2;
			int rowP = 1, colP = 1;
			boolean asc = false;
			while(cnt < 100) {
				System.out.println();
				System.out.println("row : " + row);
				System.out.println("col : " + col);
				rowP = row;
				colP = col;
//				if(col == 1) {
//					
//					//내려가야 하는 경우 
//					if(rowP == 1) {
//						colP = col;
//						row++;
//						col--;
//						asc = false;
//					//옆으로가야 하는 경우
//					} else {
//						row--;
//						col++;
//					}
//				}
//				
//				if(row == 1) {
//					
//					//내려가야 하는 경우
//					if(colP > col) {
//						rowP = row;
//						row++;
//					//대각선 올라가야 하는 경우
//					} else {
//						rowP = row;
//						colP = col;
//						row--;
//						col++;
//						asc = true;
//					}
//					
//				}
				
				
				if((row != 1) && (col != 1)) {
					if(asc) {
						row--;
						col++;
					} else {
						row++;
						col--;
					}
				} else {
					if(col == 1) {
						
						//내려가야 하는 경우 
						if(rowP == 1) {
							colP = col;
							row++;
							col--;
							asc = false;
						//옆으로가야 하는 경우
						} else {
							row--;
							col++;
						}
					}
					
					if(row == 1) {
						
						//내려가야 하는 경우
						if(colP > col) {
							rowP = row;
							row++;
						//대각선 올라가야 하는 경우
						} else {
							rowP = row;
							colP = col;
							row--;
							col++;
							asc = true;
						}
						
					}
				}
				cnt++;
				System.out.print(row + "/" + col + " " + cnt);
				if(col == 99) System.out.println();
			}
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
