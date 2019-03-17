package acm2003;//Accepted

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	DecimalFormat df1=new DecimalFormat("#0.00");
 public String abs(double i) {
	 if(i>0) return df1.format(i);
	 else return df1.format(-i);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Main ma=new Main();
		
		while(sc.hasNext()) {
			System.out.println(ma.abs(sc.nextDouble()));
		}
	}

}
