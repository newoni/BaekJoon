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

		//���Ͽ� �似Ǫ�� ���� ����Ʈ ����
		List<Integer> resList = new ArrayList<Integer>();

		int cnt=1;
		while(peopleList.size()!=0) { //peopleList �� ���̰� 0�� �� �� ���� ���� + �似Ǫ�� ���� ���� üũ
			//cnt ���� ���ذ��� �� ��� �似Ǫ�� ������ �߰��ϰ� ���� �������� �ش� �� ����
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
