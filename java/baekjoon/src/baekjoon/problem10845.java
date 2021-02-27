package baekjoon;
import java.util.ArrayList;
import java.util.Scanner;

class Queue{
	ArrayList<Integer> queueList = new ArrayList<Integer>();
	
	public void push(int inputNumber) {
		queueList.add(inputNumber);
	}
	
	public void pop() {
		if((queueList.size()) ==0) {
			System.out.println(-1);
		}else {
			System.out.println(queueList.get(0));
			queueList.remove(0);
		}
	}
	
	public void size() {
		System.out.println(queueList.size());
	}
	
	public void empty() {
		if(queueList.size()==0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	
	public void front() {
		if((queueList.size()) ==0) {
			System.out.println(-1);
		}else {
			System.out.println(queueList.get(0));
		}
	}
	
	public void back() {
		if((queueList.size()) ==0) {
			System.out.println(-1);
		}else {
			System.out.println(queueList.get(queueList.size()-1));
		}
	}
	
}

public class problem10845 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		
		Queue queueTest = new Queue();
		
		for(int i=0; i<inputNumber; i++) {
			String command = sc.next();
			
			if(command.equals("push")) {
				int number = sc.nextInt();
				queueTest.push(number);
			}else if(command.equals("pop")) {
				queueTest.pop();
			}else if(command.equals("size")) {
				queueTest.size();
			}else if(command.equals("empty")) {
				queueTest.empty();
			}else if(command.equals("front")) {
				queueTest.front();
			}else if(command.equals("back")) {
				queueTest.back();
			}
		}
		
	}

}
