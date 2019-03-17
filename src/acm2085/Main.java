package acm2085;//Accepted

import java.util.Scanner;
public class Main {
	public void howmuch(long[][] arr) {
		arr[0][0]=1;arr[0][1]=0;
		for(int i=1;i<34;i++) {
			long a=arr[i-1][0];
			long b=arr[i-1][1];
			arr[i][0]=3*a+2*b;
			arr[i][1]=a+b;
		}
	}
	public void zhufangfa() {
		Scanner sc=new Scanner(System.in);
		long[][] arr=new long[34][2];
		
		while(sc.hasNext()) {
			int n=sc.nextInt();
			if(n==-1)break;
			howmuch(arr);
			System.out.print(arr[n][0]+", "+arr[n][1]);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
		ma.zhufangfa();
	}

}
