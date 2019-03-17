package acm2014;//Accepted

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df=new DecimalFormat("#0.00");
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			double sum=0;
			for(int j=1;j<n-1;j++) {
				sum+=arr[j];
			}
			double score=sum/(n-2);
			System.out.println(df.format(score));
		}
	}

}
