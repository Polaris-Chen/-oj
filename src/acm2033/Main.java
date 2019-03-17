package acm2033;

import java.util.Scanner;

public class Main {
public void sum_AB() {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	
	while(n>0) {
		n--;
	int[] arr=new int[7];
	for(int i=1;i<7;i++) {
		arr[i]=sc.nextInt();
	}
	int second=arr[3]+arr[6];
	if(second>60) {
		second=second%60;
		arr[2]++;
	}
	int minute=arr[2]+arr[5];
	if(minute>60) {
		minute=minute%60;
		arr[1]++;
	}
	int hour=arr[1]+arr[4];
	System.out.println(hour+" "+minute+" "+second);
	
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.sum_AB();
	}

}
