package seung.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author seung
 */
public class OverAvg {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int arr[];
        int totalCnt = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for (int i = 0; i < totalCnt; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            int stdCnt = Integer.parseInt(st.nextToken());
            arr = new int[stdCnt];
            double sum = 0;
            
            for (int j = 0; j < stdCnt; j++) {
                int val = Integer.parseInt(st.nextToken());
                arr[j] = val;
                sum += val;
            }
            
            double mean = (sum / stdCnt);
            double cntOverAvg = 0;
            
            for (int j = 0; j < stdCnt; j++) {
                if (arr[j] > mean) {
                    cntOverAvg++;
                }
            }
            
            System.out.printf("%.3f%%\n", (cntOverAvg / stdCnt) * 100);
        }
    }
}
