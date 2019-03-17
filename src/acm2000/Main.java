package acm2000;//Accepted

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public void sort() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String[] arr=sc.next().split("");
			Arrays.sort(arr);
			for(int i=0;i<3;i++) {
				if(i==2)System.out.println(arr[2]);
				else System.out.print(arr[i]+" ");
			}
		}sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Main ma=new Main();
	ma.sort();
	}

}
