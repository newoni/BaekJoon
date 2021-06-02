/*
 * <21.05.23>
 * made by KH
 * source: https://www.acmicpc.net/problem/10871
 * reference: https://lnsideout.tistory.com/entry/JAVA-%EC%9E%90%EB%B0%94-%EB%AC%B8%EC%9E%90%EC%97%B4-%EC%9E%90%EB%A5%B4%EA%B8%B0-split-StringTokenizer-%EC%B0%A8%EC%9D%B4-%EB%B9%84%EA%B5%90
 */
package baekjoonWithJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class problem10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//####s
		// String split 으로 수행 --check.  <21.05.23> split이 느려서 StringTokenizer로 변경.
//		String input1 = br.readLine();
//		int arrayLength = Integer.parseInt(input1.split(" ")[0]);
//		int targetNumber = Integer.parseInt(input1.split(" ")[1]);

//		String input2 = br.readLine();
//		for(int i=0; i<arrayLength; i++) {
//			if(targetNumber> Integer.parseInt(input2.split(" ")[i])) {
//				bw.write(input2.split(" ")[i] + " ");
//			}
//		}
		//####e
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int arrayLength = Integer.parseInt(st.nextToken());
		int stdNumber = Integer.parseInt(st.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<arrayLength; i++) {
			int targetNumber = Integer.parseInt(st2.nextToken());
			if(stdNumber> targetNumber){
				bw.write(targetNumber + " ");
			}
		}
		
		bw.flush();
	}

}
