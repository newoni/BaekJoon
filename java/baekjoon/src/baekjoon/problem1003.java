/*
 * <21.05.26>
 * made by KH
 * source: https://www.acmicpc.net/problem/1003
 * reference: https://sihyungyou.github.io/baekjoon-1003/
 */
package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem1003 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int caseNumber = Integer.parseInt(br.readLine());
		for(int i=0; i<caseNumber; i++) {
			int inputNumber = Integer.parseInt(br.readLine());
			
			if(inputNumber==0) {
				bw.write(1+ " "+0);
			}else if(inputNumber==1) {
				bw.write(0+ " "+1);
			}else {
				bw.write(getFibonacci(inputNumber-2) +" " +getFibonacci(inputNumber-1));
			}
			bw.newLine();
			bw.flush();
		}
		
	}

	public static int getFibonacci(int num) {
		if(num==0) {
			return 1;
		}
		int startNum1=0;
		int startNum2=1;
		int res =0;
		for(int i=0; i<num; i++) {
			res = startNum1 + startNum2;
			startNum1 =startNum2;
			startNum2 =res;
		}
		
		
		return res;
	}
}
