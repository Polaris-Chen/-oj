package acm2079;//Accepted

import java.util.Scanner;



public class Main {
	public void zhufangfa() {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0) {
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] score=new int[k+1];
		int[] num=new int[k+1];
		int max=0;
		for(int i=1;i<=k;i++) {
			score[i]=sc.nextInt();
			num[i]=sc.nextInt();
			max+=score[i]*num[i];
		}
		int[] a=new int[max+1];
		a[0]=1;
		int[] b=new int[max+1];
		for(int i=0;i<=k;i++) {
			for(int j=0;j<=num[i]&&j*score[i]<=max;j++) {
				for(int m=0;m+j*score[i]<=max;m++) {
					b[m+j*score[i]]+=a[m];
				}
			}
			for(int m=0;m<=max;m++) {
				a[m]=b[m];
				b[m]=0;
			}
		}
		System.out.println(a[n]);
			
			
			T--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
		ma.zhufangfa();
	}

}
