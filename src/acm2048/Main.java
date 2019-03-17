package acm2048;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;



public class Main {
	public String A(int n,int m) {
		long sum=1;
		BigInteger bi=new BigInteger("1");
		for(int i=0;i<m;i++) {
			bi=bi.multiply(new BigInteger(String.valueOf(n)));
			n--;
		}
		return String.valueOf(bi);
	}
public void S() {
	
	 Scanner sc = new Scanner(System.in);
	 DecimalFormat df=new DecimalFormat("0.00");
	 while(sc.hasNext()) {
		 int T=sc.nextInt();
		 while(T>0) {
		 int n=sc.nextInt();
		 double[] arr=new double[51];
		 arr[1]=0;arr[2]=1;arr[3]=2;
		 for(int i=4;i<51;i++) {
			 arr[i]=(i-1)*(arr[i-1]+arr[i-2]);
		 }
		 double s=arr[n]/Double.parseDouble(A(n,n));
		 System.out.println(df.format(s*100)+"%");
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