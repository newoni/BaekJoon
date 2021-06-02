package baekjoonWithJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem10430 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int numA = Integer.parseInt(st.nextToken());
		int numB = Integer.parseInt(st.nextToken());
		int numC = Integer.parseInt(st.nextToken());
		
		System.out.println((numA + numB)%numC);
		System.out.println(((numA%numC) + (numB%numC))%numC);
		System.out.println((numA*numB)%numC);
		System.out.println(((numA%numC)*(numB%numC))%numC);
	}

}
