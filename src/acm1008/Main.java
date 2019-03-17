package acm1008;

import java.util.Scanner;

//Ò»´ÎAccept!!!!!!!!!!!!

public class Main {
	Scanner sc=new Scanner(System.in);
	public void q() {
		while(sc.hasNextInt()) {
			int floor=0;
			int time=0;
			int nums=sc.nextInt();
			if(nums==0) {break;}
			int[] s=new int[nums];
			for(int i=0;i<nums;i++) {
				s[i]=sc.nextInt();
			}
			for(int j=0;j<nums;j++) {
				if(s[j]>floor) {
					time+=(s[j]-floor)*6+5;
					floor=s[j];
				}
				else {
					time+=(floor-s[j])*4+5;
					floor=s[j];
					}
			}
			System.out.println(time);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main a=new Main();
		a.q();
	}

}
