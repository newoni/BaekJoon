/* 
 * <21.06.02>
 * made by KH
 * problem number: 1158
 * source: https://www.acmicpc.net/problem/1158
 * reference: 
 */

package baekjoonWithJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class problem1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int peopleNum = Integer.parseInt(st.nextToken());
		int stdNum = Integer.parseInt(st.nextToken());

		List<Integer> peopleList = new ArrayList<Integer>();

		for(int i =1; i<=peopleNum ; i++) {
			peopleList.add(i);
		}

		List<Integer> resList = new ArrayList<Integer>();

		int cnt=0;
		while(peopleList.size()!=0) { //peopleList 의 길이가 0이 될 때 까지 수행

			int iterNum = peopleList.size()/stdNum;
			if(iterNum!= 0) {
				for(int j = 1; j<=iterNum; j++) {
					resList.add(peopleList.get(j*stdNum -1));
				}

				for(int k = iterNum; k>=1 ; k--) {
					peopleList.remove(k*stdNum -1);
				}
				
				System.out.println("iteration: "+ cnt);
				System.out.println("peopelList: "+ peopleList);
				System.out.println("resList: "+ resList);

			}else { // iterNum이 0일 때
				while(peopleList.size()<stdNum) {
					stdNum -= peopleList.size();
				}
				resList.add(peopleList.get(stdNum-1));
				peopleList.remove(stdNum -1);
			}

			cnt++;
		}
		
		System.out.print("<");
		
		for(int i=0; i<resList.size(); i++) {
			System.out.print(resList.get(i));
			if(i!=resList.size()-1) {
				System.out.print(", ");
			}
		}
		System.out.print(">");
	}

}
