/*
 * <21.05.24>
 * made by KH
 * proglrm number:1010
 * source: https://www.acmicpc.net/problem/1010
 * reference: https://www.acmicpc.net/board/view/62317
 */

package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class problem1010 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      int iterNumber = Integer.parseInt(br.readLine());
	      
	      for(int i =0; i<iterNumber ;i++) {
	         StringTokenizer st = new StringTokenizer(br.readLine()," ");
	         int numberN = Integer.parseInt(st.nextToken());
	         int numberM = Integer.parseInt(st.nextToken());
	         
	         Long child = 1L; //분자
	         Long mother = 1L; //분모
	         Long result = 1L;
	         
	         for(int j=0; j<numberN ;j++) {
	            result= result * numberM;
	            numberM--;
	            result  = result / (j+1);
	         }
	         
	         System.out.println(result);
	      }

	}

}
