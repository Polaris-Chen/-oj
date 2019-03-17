package acm2076;//Accepted

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public void zhufangfa() {
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0");
		
		
		while(sc.hasNext()) {
		int n=sc.nextInt();
		int[][] arr=new int[n][3]; 
		for(int i=0;i<n;i++) {	
			arr[i][0]=sc.nextInt();
			if(arr[i][0]>12) {
				arr[i][0]=arr[i][0]-12;
			}
			arr[i][1]=sc.nextInt();
			arr[i][2]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++) {
			int hour=arr[i][0];
			int min=arr[i][1];
			int sec=arr[i][2];
			double allMin=1.0*sec/60+min;
			//System.out.println(allMin);
			double minAngle=allMin*6;
			double allHour=allMin/60+hour;
			//System.out.println(allHour);
			double hourAngle=allHour*30;
			//System.out.println(hourAngle);
			double s=Math.abs(minAngle-hourAngle);
			//System.out.println(s);
			int finalAngel=(int)Math.min(s,360-s );
			System.out.println(finalAngel);
		}
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
		ma.zhufangfa();
	}

}
