package acm2036;//Accepted

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

public void SOfMulity() {
	Scanner sc=new Scanner(System.in);
	DecimalFormat df=new DecimalFormat("0.0");
	while(sc.hasNext()) {
		int n=sc.nextInt();
		if(n==0)break;
		int[][] arr=new int[n+1][2];
		int[][] vector=new int[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
			arr[i][j]=sc.nextInt();
			}
		}
		arr[n][0]=arr[0][0];
		arr[n][1]=arr[0][1];
	
		double sum=0;
		for(int i=0; i<n; i++)
	        sum = sum + (arr[i][0]*arr[i+1][1] - arr[i+1][0]*arr[i][1]);//求多边形面积公式

		System.out.println(df.format(sum/2));
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.SOfMulity();
	}

}
