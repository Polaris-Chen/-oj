package acm2042;//Accepted

import java.util.Scanner;

public class Main {

	public int score(int x) {
		int sum=3;
		for(int i=0;i<x;i++) {
			sum=(sum-1)*2;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
		System.out.println(ma.score(arr[i]));
		}
	}

}
