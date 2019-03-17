package acm2024;//Accepted

import java.util.Scanner;

public class Main {
public void legalOfMark() {
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	String[] arr=new String[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextLine();
	}
	for(int i=0;i<n;i++) {
		if(Character.isDigit(arr[i].charAt(0))) {
			System.out.println("no");
			continue;
		}
		int count=0;
		for(int j=0;j<arr[i].length();j++) {
			char a=arr[i].charAt(j);
			if(Character.isDigit(a)||Character.isLetter(a)||Character.toString(a).equals("_")) 
			count++;
	    }
		if(count==arr[i].length()) {
			System.out.println("yes");
		}
		else {System.out.println("no");}
	

	}
}
	public static void main(String[] args) {
	
Main ma=new Main();
ma.legalOfMark();
	}

}
