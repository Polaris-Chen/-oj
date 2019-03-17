package acm2013;//Accepted

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int n=sc.nextInt();
		int first=1;
		
		for(int i=1;i<n;i++) {
			first=(first+1)*2;
		}
		System.out.println(first);
	}
}
}
