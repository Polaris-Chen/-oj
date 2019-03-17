package acm2001;//Accepted

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	DecimalFormat df1=new DecimalFormat("#0.00");
	public void distance() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String arr[]=sc.nextLine().split("\\s+");
			double x1=Double.parseDouble(arr[0]);
			double y1=Double.parseDouble(arr[1]);
			double x2=Double.parseDouble(arr[2]);
			double y2=Double.parseDouble(arr[3]);
			double distance=Math.pow((x1-x2),2)+Math.pow((y1-y2),2);
			System.out.println(df1.format(Math.pow(distance, 0.5)));
		
		}
	sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.distance();
	}

}
