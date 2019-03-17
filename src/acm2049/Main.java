package acm2049;//Accepted

import java.math.BigInteger;

import java.util.Scanner;



public class Main {
	public String A(int n,int m) {
	
		BigInteger bi=new BigInteger("1");
		for(int i=0;i<m;i++) {
			bi=bi.multiply(new BigInteger(String.valueOf(n)));
			n--;
		}
		return String.valueOf(bi);
	}
	public long C(int n,int m) {
		return Long.parseLong(A(n,m))/Long.parseLong(A(m,m));
	}
public void S() {
	
	 Scanner sc = new Scanner(System.in);
	
	 while(sc.hasNext()) {
		 int T=sc.nextInt();
		 while(T>0) {
		 int n=sc.nextInt();
		 int m=sc.nextInt();
		 long[] arr=new long[51];
		 arr[1]=0;arr[2]=1;arr[3]=2;
		 for(int i=4;i<51;i++) {
			 arr[i]=(i-1)*(arr[i-1]+arr[i-2]);
		 }
		 long s=(arr[m]*C(n,m));
		 System.out.println(s);
		 T--;
	 }
	 }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.S();
	}

}