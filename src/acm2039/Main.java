package acm2039;//没看到是正数不是整数

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	

	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	
		int n=sc.nextInt();
		
		double[][] arr=new double[n][3];
		for(int i=0;i<n;i++) {
			arr[i][0]=sc.nextDouble();
			arr[i][1]=sc.nextDouble();
			arr[i][2]=sc.nextDouble();
		}
		for(int i=0;i<n;i++) {
			double a=arr[i][0];
			double b=arr[i][1];
			double c=arr[i][2];
		if(a+b>c&&a+c>b&b+c>a) {
			System.out.println("YES");
		}
		else System.out.println("NO");
		}
	
	
}
}
