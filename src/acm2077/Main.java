package acm2077;//Accepted

import java.util.Scanner;
public class Main {
	public void zhufangfa() {
		Scanner sc=new Scanner(System.in);
		long[] arr=new long[22];
		for(int i=1;i<22;i++) {
			arr[i]=arr[i-1]*3+2;
		}
		while(sc.hasNext()) {
		int n=sc.nextInt();
		while(n>0) {
			int s=sc.nextInt();
			long sum=arr[s-1]+2;
			System.out.println(sum);
			n--;
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
		ma.zhufangfa();
	}

}
