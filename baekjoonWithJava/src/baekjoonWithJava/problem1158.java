/* 
 * <21.06.05>
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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		
		//전체 수, 기준 수 입력 바기
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int peopleNum = Integer.parseInt(st.nextToken());
		int stdNum = Integer.parseInt(st.nextToken());

		//최초 순열 생성
		List<Integer> peopleList = new ArrayList<Integer>();
		for(int i =1; i<=peopleNum ; i++) {
			peopleList.add(i);
		}

		//리턴용 요세푸스 순열 리스트 선언
		List<Integer> resList = new ArrayList<Integer>();

		int cnt=1;
		while(peopleList.size()!=0) { //peopleList 의 길이가 0이 될 때 까지 수행 + 요세푸스 기준 여부 체크
			//cnt 값이 기준값이 될 경우 요세푸스 순열에 추가하고 최초 순열에서 해당 값 제거
			if(cnt==stdNum) {
				cnt=1;
				resList.add(peopleList.get(0));
				peopleList.remove(0);
				continue;
			}
			
			peopleList.add(peopleList.get(0));
			peopleList.remove(0);
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
