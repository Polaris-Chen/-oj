package acm2027;//Accepted

import java.util.Scanner;

public class Main {
public void scoreOfYuanYin() {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String[] arr=new String[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.next();
	}
	for(int i=0;i<n;i++) {
		int countA=0,countE=0,countI=0,countO=0,countU=0;
		char[] chars=arr[i].toCharArray();
		for(int j=0;j<chars.length;j++) {
			if(chars[j]=='a'||chars[j]=='A') countA++;
			else if(chars[j]=='e'||chars[j]=='E')countE++;
			else if(chars[j]=='i'||chars[j]=='I') countI++;
			else if(chars[j]=='o'||chars[j]=='O') countO++;
			else if(chars[j]=='u'||chars[j]=='U') countU++;
		}
		System.out.println("a:"+countA);
		System.out.println("e:"+countE);
		System.out.println("i:"+countI);
		System.out.println("o:"+countO);
		System.out.println("u:"+countU);
		if(i!=n-1)System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.scoreOfYuanYin();
	}

}
