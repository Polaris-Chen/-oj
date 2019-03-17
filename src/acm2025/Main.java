package acm2025;//Accepted

import java.util.Scanner;

public class Main {
public void max() {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		String s=sc.next();
		int max=0;
		for(int i=0;i<s.length();i++) {
			int singleChar=s.charAt(i);
			int maxChar=s.charAt(max);
			if(singleChar>maxChar)
				max=i;
		}
		
		char maxChar=s.charAt(max);
		
		String newS=s.replaceAll(Character.toString(maxChar), maxChar+"(max)");
		
		System.out.println(newS);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.max();
	}

}
