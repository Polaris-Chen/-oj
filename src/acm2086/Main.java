package acm2086;//Accepted

import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {


	public void zhufangfa() {
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.00");
		
		while(sc.hasNext()) {
			int n=sc.nextInt();
			double a0=sc.nextDouble();
			double an_1=sc.nextDouble();
			double[] C=new double[n+1];
			for(int i=1;i<=n;i++) {
				C[i]=sc.nextDouble();
				
			}
			double sum=0;
			for(int i=1;i<=n;i++) {
				sum+=2*(n-i+1)*C[i];
			}
			double A1=(an_1+n*a0-sum)/(n+1);
			System.out.println(df.format(A1));
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
		ma.zhufangfa();
	}

}
