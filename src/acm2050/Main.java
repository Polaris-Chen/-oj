package acm2050;//Accepted

import java.util.Scanner;

public class Main {
public void S() {
	 Scanner sc = new Scanner(System.in);
	 while(sc.hasNext()) {
		
		
			 
			 int n=sc.nextInt();
		
		 long[] arr=new long[10002];
		 int[] arr2=new int[n];
		 arr[1]=2;arr[2]=7;
		 for(int i=0;i<n;i++) {
			 arr2[i]=sc.nextInt();
		 }
		 arr[1]=2;arr[2]=7;
		 for(int i=3;i<10001;i++) {
			 arr[i]=2*i*i-i+1;
		 }
		 for(int i=0;i<n;i++) {
		 System.out.println(arr[arr2[i]]);
		
		 }
	 }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.S();
	}

}