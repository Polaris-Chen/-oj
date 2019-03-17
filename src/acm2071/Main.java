package acm2071;//Accepted

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df=new DecimalFormat("0.00");
		 Scanner sc=new Scanner(System.in);
		 int T=sc.nextInt();
		 while(T>0){
			 int n=sc.nextInt();
			 double[] arr=new double[n];
			 for(int i=0;i<n;i++) {
				 arr[i]=sc.nextDouble();
			 }
			 Arrays.sort(arr);
			 System.out.println(df.format(arr[arr.length-1]));
			 T--;
		 }
	}

}
