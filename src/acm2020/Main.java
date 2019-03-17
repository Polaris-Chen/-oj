package acm2020;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public void swap(int[] arr,int a,int b) {
		int temp=arr[b];
		arr[b]=arr[a];
		arr[a]=temp;
	}

public void absSort() {
	Scanner sc=new Scanner(System.in);
  while(sc.hasNext()){
	int n=sc.nextInt();
	if(n==0)break;
	int[] arr=new int[n];
	int[] mark=new int[n];//·ûºÅÊý×é
	for(int i=0;i<n;i++) {
	   int x=sc.nextInt();
	    if(x>0) {
		 arr[i]=x;
		 mark[i]=1;
	    }
	    else {
		 arr[i]=Math.abs(x);
		 mark[i]=-1;
	    }
	  }
	for(int i=0;i<n;i++) {//²åÈëÅÅÐò
		for(int j=i;j>0;j--) {
			if(arr[j]>arr[j-1]) {
				swap(arr,j-1,j);
				swap(mark,j-1,j);
			}
			else break;
		}
	}
	for(int k=0;k<n;k++) {
		int s=arr[k]*mark[k];
		if(k==0) {
			System.out.print(s);
		}
		else System.out.print(" "+s);
	}
	System.out.println();
  }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.absSort();
	}

}
