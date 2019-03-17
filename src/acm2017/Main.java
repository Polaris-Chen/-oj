package acm2017;

import java.util.Scanner;

public class Main {
public void numScore() {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T>0) {
		String s=sc.next();
		int n=s.length(),score=0;
		for(int i=0;i<n;i++) {
			if(Character.isDigit(s.charAt(i))) {
				score++;
			}
		}
		T--;
		System.out.println(score);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.numScore();
	}

}
