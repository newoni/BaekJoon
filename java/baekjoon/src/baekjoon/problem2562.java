/*
 <21.03.08>
 made by KH
 problem number: 2562
 source: https://www.acmicpc.net/problem/2562
 */
package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;


public class problem2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputNumber = 0;
		for(int i=0 ; i<9; i++) {
			inputNumber = Integer.parseInt(bf.readLine());
			
			numberList.add(inputNumber);
		}
		
		int maxValue = Collections.max(numberList);
		System.out.println(maxValue);
		
		
		System.out.println(numberList.indexOf(maxValue)+1);
		
		
		
	}

}
