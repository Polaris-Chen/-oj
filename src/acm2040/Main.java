package acm2040;//Accepted

import java.util.Scanner;

public class Main {
public void same() {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[][] arr=new int[n][2];
	for(int i=0;i<n;i++) {
		arr[i][0]=sc.nextInt();
		arr[i][1]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		int[] arrA=son(arr[i][0]);
		int[] arrB=son(arr[i][1]);
		int sumA=sum(arrA);
		int sumB=sum(arrB);
		if(sumA==arr[i][1]&&sumB==arr[i][0]) {
			System.out.println("YES");
		}
		else System.out.println("NO");
	}
	
}
public int sum(int[] arr) {
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			sum+=arr[i];
		}
		else break;
	}
	return sum;
}
public int[] son(int x) {
	int[] arr=new int[x];
	int k=0;
	for(int i=1;i<x;i++) {
		if(x%i==0) {
			arr[k]=i;
			k++;
		}
	}
	
	return arr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.same();
	}

}
