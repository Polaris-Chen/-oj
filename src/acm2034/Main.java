
package acm2034;//Accepted 没考虑单个集合为零的情况

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public void swap(int[] arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public void sort(int[] arr,int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}
				
			}
		}
	}
public void minus() {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
		int nA=sc.nextInt();
		int nB=sc.nextInt();
		if(nA==0&&nB==0) {
			break;
		}
		else if(nA==0) {
			int[] arrB=new int[nB];
			for(int i=0;i<nB;i++) {
				arrB[i]=sc.nextInt();
			}
			System.out.println("NULL");
		}
		else if(nB==0) {
			int[] arrA=new int[nA];
			for(int i=0;i<nA;i++) {
				arrA[i]=sc.nextInt();
			}
			Arrays.sort(arrA);
			for(int i=0;i<nA;i++) {
				System.out.print(arrA[i]+" ");
			}
			System.out.println();
		}
		else {
		int[] arrA=new int[nA];
		int[] arrB=new int[nB];
		for(int i=0;i<nA;i++) {
			arrA[i]=sc.nextInt();
		}
		for(int i=0;i<nB;i++) {
			arrB[i]=sc.nextInt();
		}
		int[] count=new int[nA];
		
		int k=0;
		for(int j=0;j<nA;j++) {
			boolean flag=false;
			int score=arrA[j];
			for(int i=0;i<nB;i++) {
				if(score==arrB[i]) {
					flag=false;
					break;
				}
				else 	flag=true;
				
			}
			if(flag) {
				count[k]=score;
				k++;
			}
		}
		
		if(k==0) {
			System.out.println("NULL");
			}
		else {
			sort(count,k);
			for(int i=0;i<k;i++) {
				System.out.print(count[i]+" ");
			}
			System.out.println();
		}
	}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.minus();
	}

}
