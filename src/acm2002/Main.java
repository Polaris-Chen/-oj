package acm2002;//Accepted

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	DecimalFormat df1=new DecimalFormat("#0.000");
	final double PI=3.1415927;
	Scanner sc=new Scanner(System.in);
	public void S() {
		while(sc.hasNext()) {
			double r=sc.nextDouble();
			//double j=4/3;  ’‚¿Ô¥ÌŒÛ   4/3=1
			
			double S=(4.0/3.0)*PI*Math.pow(r, 3);
			System.out.println(df1.format(S));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.S();
	}

}
