package baekjoon;
import java.util.Scanner;

public class problem10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int repeatNumber = sc.nextInt();
		
		for(int i=1; i<=repeatNumber; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
		}
	sc.close();
	}
}
