/*
 * <21.03.26>
 * made by KH
 * 
 * source: https://www.acmicpc.net/problem/10809
 */

package baekjoonWithJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem10809 {

	public static void main(String[] args) throws IOException {

		
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		char  start = 'a';
		
		for(int i=0; i<26 ; i++ ,start++) {
			bw.write(Integer.toString(s.indexOf(start))+" ");
			bw.flush();
		}
	}

}
