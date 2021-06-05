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

		List<Integer> resList = new ArrayList<Integer>();
		//출력 준비
		bw.write("<");

		int cnt=1;
		for(int i=0; i<peopleList.size();i++) {
			
			//추가 기준 달성 시 추가
			if(cnt==stdNum) {
//				System.out.println("cnt==stdNum 달성");
				
				resList.add(peopleList.get(i));
				
				// 정지 기준 달성시 정지
				if(resList.size()==peopleNum) {
//					System.out.println("resList.size()==peopleNum 달성");
//					System.out.println("resList.size() 값: "+ resList.size());
//					System.out.println("peopleNum 값: "+ peopleNum);
//					System.out.println("resList 값: "+ resList);
//					System.out.println("정지 시 i 값: "+ i);
					break;
				}
				
//				System.out.println("정지 기준 미달성");
//				System.out.println("resList 출력: " + resList);
				cnt=1;
				continue;
			}
			
			//자신의 위치 추가 
			peopleList.add(peopleList.get(i));
			cnt++;
//			System.out.println(peopleList);
		}
		
		
		for(int j=0; j<resList.size(); j++) {
			if(j!=resList.size()-1) {
				bw.write(resList.get(j)+", ");
			}
			else {
				bw.write(resList.get(j)+"");
			}
		}
		
		bw.write(">");
		bw.flush();
	}

}
