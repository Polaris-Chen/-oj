package acm2005;//Accepted

import java.util.Scanner;

public class Main {
	int[] allMonth=new int[] {-1,31,28,31,30,31,30,31,31,30,31,30,31};
	
public void dayScore() {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int mark=0;
		int sum_day=0;
		String arr[]=sc.next().split("\\/");
		int year=Integer.parseInt(arr[0]);
		int month=Integer.parseInt(arr[1]);
		int day=Integer.parseInt(arr[2]);
		if(year%100==0) {
			if(year%400==0) mark=1;
		}//求闰年的步骤
		else if(year%4==0) {
			mark=1;
		}
		
		if(mark==1)allMonth[2]++;
		for(int i=1;i<month;i++) {
			sum_day+=allMonth[i];
		}
		sum_day+=day;
		if(mark==1)allMonth[2]--;
		System.out.println(sum_day);
	}sc.close();
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.dayScore();
	}

}
