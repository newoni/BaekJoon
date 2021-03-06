/*
 <21. 03. 08>
 made by KH
 
 problem number: 14681
 source: https://www.acmicpc.net/problem/14681
 */
package baekjoonWithJava;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem14681 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int inputNumber1 = Integer.parseInt(bf.readLine());
		int inputNumber2 = Integer.parseInt(bf.readLine());
		
		if(inputNumber1>0 && inputNumber2>0) {
			bw.write("1");
			bw.flush();
		}else if(inputNumber1>0 && inputNumber2<0){
			bw.write("4");
			bw.flush();
		}else if(inputNumber1<0 && inputNumber2<0){
			bw.write("3");
			bw.flush();
		}else if(inputNumber1<0 && inputNumber2>0){
			bw.write("2");
			bw.flush();
		}
	}
}
