/*
 * <21.02.28>
 * made by KH
 * 
 * source: https://www.acmicpc.net/problem/10845
 * reference: https://coding-factory.tistory.com/251
 * reference: https://code0xff.tistory.com/10
 */

package baekjoonWithJava;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Queue{
	ArrayList<Integer> queueList = new ArrayList<Integer>();
	
//	<21.02.28> BufferedWriter È°¿ë
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public void push(int inputNumber) {
		queueList.add(inputNumber);
	}
	
	public int pop()  {
		if((queueList.size()) ==0) {
			return -1;
		}else {
			int res = queueList.get(0);
			queueList.remove(0);
			
			return res; 
		}
	}
	
	public int size() {
		return queueList.size();
	}
	
	public int empty(){
		if(queueList.size()==0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public int front() {
		if((queueList.size()) ==0) {
			return -1;
		}else {
			return queueList.get(0);
		}
	}
	
	public int back(){
		if((queueList.size()) ==0) {
			return -1;
		}else {
			return queueList.get(queueList.size()-1);
		}
	}
	
}

public class problem10845 {

	public static void main(String[] args) throws IOException {
		
//		Scanner sc = new Scanner(System.in);
//		int inputNumber = sc.nextInt();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int inputNumber = Integer.parseInt(bf.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Queue queueTest = new Queue();
		
		
		for(int i=0; i<inputNumber; i++) {
//			String command = sc.next();
			String command = bf.readLine();
			
			
			if(command.equals("pop")) {
				bw.write(Integer.toString(queueTest.pop()));
				bw.newLine();
				bw.flush();
			}else if(command.equals("size")) {
				bw.write(Integer.toString(queueTest.size()));
				bw.newLine();
				bw.flush();
			}else if(command.equals("empty")) {
				bw.write(Integer.toString(queueTest.empty()));
				bw.newLine();
				bw.flush();
			}else if(command.equals("front")) {
				bw.write(Integer.toString(queueTest.front()));
				bw.newLine();
				bw.flush();
			}else if(command.equals("back")) {
				bw.write(Integer.toString(queueTest.back()));
				bw.newLine();
				bw.flush();
			}else { // push
				String[] array = command.split(" ");
				queueTest.push(Integer.parseInt(array[1]));
			}
		}
		
	}

}
