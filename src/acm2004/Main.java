package acm2004;//Accepted

import java.util.Scanner;

public class Main {
public void score() {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int score=sc.nextInt();
		if(score>100||score<0) {
			System.out.println("Score is error!");
		}
		else if(score>=0&&score<60) {
			System.out.println("E");
		}
		else if(score>=60&&score<70) {
			System.out.println("D");
		}
		else if(score>=70&&score<80) {
			System.out.println("C");
		}
		else if(score>=80&&score<90) {
			System.out.println("B");
		}
		else System.out.println("A");
	}sc.close();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.score();
	}

}
