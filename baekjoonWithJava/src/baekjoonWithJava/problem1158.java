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
		
		//��ü ��, ���� �� �Է� �ٱ�
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int peopleNum = Integer.parseInt(st.nextToken());
		int stdNum = Integer.parseInt(st.nextToken());

		//���� ���� ����
		List<Integer> peopleList = new ArrayList<Integer>();
		for(int i =1; i<=peopleNum ; i++) {
			peopleList.add(i);
		}

		List<Integer> resList = new ArrayList<Integer>();
		//��� �غ�
		bw.write("<");

		int cnt=1;
		for(int i=0; i<peopleList.size();i++) {
			
			//�߰� ���� �޼� �� �߰�
			if(cnt==stdNum) {
//				System.out.println("cnt==stdNum �޼�");
				
				resList.add(peopleList.get(i));
				
				// ���� ���� �޼��� ����
				if(resList.size()==peopleNum) {
//					System.out.println("resList.size()==peopleNum �޼�");
//					System.out.println("resList.size() ��: "+ resList.size());
//					System.out.println("peopleNum ��: "+ peopleNum);
//					System.out.println("resList ��: "+ resList);
//					System.out.println("���� �� i ��: "+ i);
					break;
				}
				
//				System.out.println("���� ���� �̴޼�");
//				System.out.println("resList ���: " + resList);
				cnt=1;
				continue;
			}
			
			//�ڽ��� ��ġ �߰� 
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
