package acm2078;//Accepted

import java.util.Arrays;
import java.util.Scanner;



public class Main {
	public void zhufangfa() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int T=sc.nextInt();
		
		while(T>0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println((int)Math.pow(100-arr[0], 2));
		
			T--;
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
		ma.zhufangfa();
	}

}
