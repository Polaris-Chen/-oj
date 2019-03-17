package acm2098;

import java.util.Scanner;

public class Main {
	public static boolean ifsu(int n) {
		for(int i=3;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
			return false;
			}
	}
		return true;
	}
public static void  ifSu(int[] arr) {
	int j=0;
	for(int i=2;i<10000;i++) {
		if(!ifsu(i)) {
			continue;
		}
		else arr[i]=i;
		
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 while(sc.hasNext()) { 
		 int T=sc.nextInt();
		 if(T==0)break;
		 int[] arr=new int[10000];
		 int count=0;
		 //ifSu(arr);
			
			/*
			 * for(int i=3;i<=T/2;i+=2) { if(arr[i]!=0&&arr[T-i]!=0) { count++; }
			 * 
			 * }
			 */
		 for(int i=3;i<T/2;i+=2){
			 if(ifsu(i)&&ifsu(T-i)) {
				 count++;
			 }
		 }
		 System.out.println(count);
		 }
	}

}
