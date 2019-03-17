package acm2083;//Accepted

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int T=sc.nextInt();
		 while(T>0){
			 int N=sc.nextInt();
			 int[] arr=new int[N+1];
			 for(int i=1;i<N+1;i++) {
				 arr[i]=sc.nextInt();
			 }
			 long sum=Long.MAX_VALUE;
			 for(int i=1;i<N+1;i++) {
				 long temp=0;
				 for(int j=1;j<N+1;j++) {
					 temp+=Math.abs(arr[i]-arr[j]);
				 }
				 if(temp<sum) {
					 sum=temp;
				 }
			 }
			 System.out.println(sum);
			 T--;
		 }
	}

}
