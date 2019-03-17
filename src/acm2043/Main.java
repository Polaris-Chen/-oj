package acm2043;//Accepted

import java.util.Scanner;

public class Main {
public void code() {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String[] arr=new String[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.next();
	}
	for(int i=0;i<n;i++) {
		if(arr[i].length()<8||arr[i].length()>16) {
			System.out.println("NO");
			continue;
		}
		boolean flagA=false,flaga=false,flagnum=false,flagUn=false;
		char[] s=arr[i].toCharArray();
		for(int j=0;j<s.length;j++) {
			if(Character.isDigit(s[j])) {
				flagnum=true;
			}
			else if(Character.isUpperCase(s[j])) {
				flagA=true;
			}
			else if(Character.isLowerCase(s[j])) {
				flaga=true;
			}
			else flagUn=true;
		}
		int count=0;
		if(flagA)count++;
		if(flaga)count++;
		if(flagnum)count++;
		if(flagUn)count++;
		if(count>2) {
			System.out.println("YES");
		}
		else System.out.println("NO");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.code();
	}

}
