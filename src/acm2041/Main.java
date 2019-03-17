package acm2041;//Accepted
//其实是斐波那契数列

import java.util.Scanner;

public class Main {
public int step(int now,int last) {
	if(last-now==1||last-now==0) {
		return 1;
	}
	int count=step(now+1,last)+step(now+2,last);
	return count;
}
public void step1() {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		System.out.println(step(1,arr[i]));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.step1();
	}

}
