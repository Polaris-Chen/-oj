package acm2047;//Accepted

import java.util.Scanner;



public class Main {
public void S() {
	 Scanner sc = new Scanner(System.in);
	 while(sc.hasNext()) {
		 int n=sc.nextInt();
		 long[] arr=new long[51];
		 arr[1]=3;arr[2]=8;
		 for(int i=3;i<51;i++) {
			 arr[i]=2*(arr[i-1]+arr[i-2]);
		 }
		 System.out.println(arr[n]);
	 }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.S();
	}

}