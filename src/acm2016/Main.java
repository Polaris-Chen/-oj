package acm2016;

import java.util.Scanner;//Accepted

public class Main {
public void change() {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int length=sc.nextInt();
		if(length==0) {
			break;
		}
		int[] arr=new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=sc.nextInt();
		}
		int min=0;
		for(int j=0;j<length;j++) {
			if(arr[j]<arr[min]) {
				min=j;
			}
		}
		int temp=arr[0];
		arr[0]=arr[min];
		arr[min]=temp;
		for(int k=0;k<length;k++) {
			if(k!=length-1) System.out.print(arr[k]+" ");
			else System.out.print(arr[k]);
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.change();
	}

}
