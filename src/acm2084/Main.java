package acm2084;//Accepted

import java.util.Scanner;

public class Main {
	public void zhufangfa() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int T=sc.nextInt();
		
		while(T>0) {
			int n=sc.nextInt();
			int[][] arr=new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<=i;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			for(int i=n-2;i>=0;i--) {
				for(int j=0;j<=i;j++) {
				arr[i][j]+=Math.max(arr[i+1][j],arr[i+1][j+1]);
						
				}
			}
			System.out.println(arr[0][0]);
		T--;
		}
	  }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
		ma.zhufangfa();
	}

}
