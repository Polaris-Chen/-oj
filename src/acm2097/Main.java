package acm2097;//Accepted

import java.util.Scanner;

public class Main {
	public static int tenTo16(int a) {
		int[] arr=new int[6];
		int i=0;
		while(a>0) {
			
			int s1=a%16;
			arr[i]=s1;
			i++;
			a=a/16;
			//System.out.println(s1);
		}
		int sum=0;
		for(int j=0;j<6;j++) {
			sum=sum+arr[j];
		}
		//System.out.println(sum);
		return sum;
	}
	public static int tenTo12(int a) {
		int[] arr=new int[8];
		int i=0;
		while(a>0) {
			
			int s1=a%12;
			arr[i]=s1;
			i++;
			a=a/12;
			
		}
		int sum=0;
		for(int j=0;j<8;j++) {
			sum+=arr[j];
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 while(sc.hasNext()) { 
			 int xx=sc.nextInt();
			 if(xx==0)break;
		 char[] s=String.valueOf(xx).toCharArray();
		 int sum=0;
		 for(int i=0;i<s.length;i++) {
			 sum+=Integer.parseInt(String.valueOf(s[i]));
		 }
			/*
			 * System.out.println(sum); System.out.println(tenTo16(xx));
			 * System.out.println(tenTo12(xx));
			 */
		 if(sum==tenTo16(xx)&&sum==tenTo12(xx)) {
			 System.out.println(xx+" is a Sky Number.");

		 }
		 else System.out.println(xx+" is not a Sky Number.");
		
		 }
	}

}
