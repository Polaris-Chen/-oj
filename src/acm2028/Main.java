package acm2028;//Accepted

import java.util.Scanner;

public class Main {
	public int max(int[] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[max]) {
				max=i;
			}
		}
		return arr[max];
	}
	public long leicheng(int[] arr) {
		long score=1;
		for(int i=0;i<arr.length;i++) {
			score*=arr[i];
		}
		return score;
	}
public void maxBeiShu(){
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int MaxBei=max(arr);
		long Maxscore=leicheng(arr);
		//System.out.println(Maxscore);
		//System.out.println(MaxBei);
		while(MaxBei<=Maxscore) {
			boolean flag=false;
			for(int i=0;i<n;i++) {
				if(MaxBei%arr[i]==0) {
					flag=true;
				}
				else {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(MaxBei);
				break;
			}
			MaxBei++;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.maxBeiShu();
	}

}
