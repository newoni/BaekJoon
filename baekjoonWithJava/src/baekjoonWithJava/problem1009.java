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
		/*��� �����ؾ� 1�� �ڸ��� �ڱ� �ڽ����� �������� Ȯ���� �� �ִ�*/
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
			
			//�ڱ��ڽ����� ���ƿ��� ���ذ� ���
			int powIterNum = calcPowIterNumber(arg1);
			
			//arg2�� ���ذ��� �󸶳� �Ѵ��� Ȯ��
			int targetNumber = (int)(arg2)%powIterNum;
			
			//����� ����� ����
			int res = 0;
			
			if(powIterNum==1) {
				res = (int)(arg1%10); //��� �ڱ� �ڽ����� ���ƿ´ٸ�, �ڽ��� 1���ڸ����� ��ġ ���.
				if(res==0) {
					bw.write(Integer.toString(10) +"\n");
				}else {
					bw.write(Integer.toString(res)+"\n");
				}
			}
			else if(targetNumber==0) { //1�� �ڸ��� 1�� �Ǵ� ���
				res = (int)Math.pow(arg1, powIterNum)%10;
				bw.write(Integer.toString(res)+"\n");
			}else {
				res=(int)Math.pow(arg1, targetNumber)%10; //1���ڸ��� 1�̵Ǵ� �� �ƴ϶� ��� �� �������� ���
				bw.write(Integer.toString(res)+"\n");
			}
			
			bw.flush();
		}
	}

}
