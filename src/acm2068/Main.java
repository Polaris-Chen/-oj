package acm2068;

import java.util.Scanner;

public class Main {
	public long C(int n,int m) {//这样算C容易出现bug 因为 A过大 容易超出long的范围,所以算之前可以用n-m
		//                              和m的中的最小值来求;
		if(n-m<m) {
			m=n-m;
			
		}
		long sum=1;
		sum=A(n,m)/A(m,m);
		return sum;
		
	}
	public long A(int n,int m) {
		long sum=1;
		for(int i=0;i<m;i++) {
			sum=sum*n;
			n--;
			
		}
		return sum;
	}
	public void S() {
		Scanner sc=new Scanner(System.in);
		long[] arr=new long[40];
		arr[1]=0;arr[2]=1;
		for(int i=3;i<40;i++) {
			arr[i]=(i-1)*(arr[i-1]+arr[i-2]);
		}
		while(sc.hasNext()) {
			int n=sc.nextInt();
			if(n==0) {
				break;
			}
			int need=n-n/2;
			long sum=1;
			for(int i=need;i<n+1;i++) {
				long sum1=C(n,i)*arr[n-i]; 
				sum+=sum1;
			}
			/*
			 * for(int i=2;i<=n/2;i++) { long sum1=C(n,i)*arr[i]; sum+=sum1; }
			 */
		
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.S();

	}

}
