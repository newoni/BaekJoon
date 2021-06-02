/*
 * <21.05.22>
 * made by KH
 * problem number: 1009
 * source: https://www.acmicpc.net/problem/1009
 * reference: https://coding-factory.tistory.com/531
 */

package baekjoonWithJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem1009 {
	public static int calcPowIterNumber(int number) {
		/*몇번 제곱해야 1의 자리가 자기 자신으로 나오는지 확인할 수 있다*/
		number = number%10;
		int cnt =1;
		int resNumber=(int)(number*number)%10;
		for(cnt=1; number !=resNumber  ;cnt++) {
			
			if(number==resNumber) {
				break;
			}
			resNumber = (int)(number * resNumber)%10;
		}
		
		return cnt;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		int iterNum = Integer.parseInt(bf.readLine());
		for(int i =0; i<iterNum ; i++) {
			String inputData = bf.readLine();
			int arg1 = Integer.parseInt(inputData.split(" ")[0]);
			int arg2 = Integer.parseInt(inputData.split(" ")[1]);
			
			//자기자신으로 돌아오는 기준값 얻기
			int powIterNum = calcPowIterNumber(arg1);
			
			//arg2가 기준값을 얼마나 넘는지 확인
			int targetNumber = (int)(arg2)%powIterNum;
			
			//결과값 저장용 변수
			int res = 0;
			
			if(powIterNum==1) {
				res = (int)(arg1%10); //계속 자기 자신으로 돌아온다면, 자신의 1의자리수의 위치 출력.
				if(res==0) {
					bw.write(Integer.toString(10) +"\n");
				}else {
					bw.write(Integer.toString(res)+"\n");
				}
			}
			else if(targetNumber==0) { //1의 자리가 1이 되는 경우
				res = (int)Math.pow(arg1, powIterNum)%10;
				bw.write(Integer.toString(res)+"\n");
			}else {
				res=(int)Math.pow(arg1, targetNumber)%10; //1의자리가 1이되는 게 아니라 몇번 더 곱해지는 경우
				bw.write(Integer.toString(res)+"\n");
			}
			
			bw.flush();
		}
	}

}
