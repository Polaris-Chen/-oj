package acm2011;//Accepted

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
public double sum(int a) {
	double sum=0;
	for(double i=1;i<a+1;i++) {
		double j=(1/i);
		System.out.println(j);
		if(i%2==0) {
			sum-=j;
		}
		else  sum+=j;
	}
return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
DecimalFormat df=new DecimalFormat("#0.00");

Main ma=new Main();
	int T=sc.nextInt();
	int[] arr=new int[T];
	//sc.next();
	for(int i=0;i<T;i++) {
	arr[i]=sc.nextInt();
	}
	for(int j=0;j<T;j++) {
	System.out.println(df.format(ma.sum(arr[j])));
	}
	}

}
