package acm2070;

import java.util.Scanner;


public class Main {
	public void zhufangfa() {
		Scanner sc=new Scanner(System.in);
		long[] arr=new long[55];
		arr[0]=0;arr[1]=1;
		for(int i=2;i<55;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		while(sc.hasNext()) {
			int n=sc.nextInt();
			if(n==-1)break;
			System.out.println(arr[n]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
		ma.zhufangfa();
	}

}
