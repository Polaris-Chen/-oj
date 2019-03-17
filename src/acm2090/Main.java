package acm2090;//莫名其妙的弱智题??
//Accepted

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DecimalFormat df=new DecimalFormat("0.0");
		Scanner sc=new Scanner(System.in);
		double sum=0;
		
		while(sc.hasNext()) {
			

             sc.next();
			double score=sc.nextDouble();
			double money=sc.nextDouble();
			sum+=score*money;
			
			
		}
		System.out.println(df.format(sum));
		// TODO Auto-generated method stub

	}

}
