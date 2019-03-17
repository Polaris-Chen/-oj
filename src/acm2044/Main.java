package acm2044;//一直调用方法太耗费时间了 直接把结果放在数组里
import java.util.Scanner;


public class Main {

public void step1() {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[][] arr=new int[n][2];
	long[] arr1=new long[51];
	arr1[0]=0;
	arr1[1]=1;
	arr1[2]=2;
	arr1[3]=3;
	for(int i=4;i<51;i++) {
	arr1[i]=arr1[i-1]+arr1[i-2];	
	}
	for(int i=0;i<n;i++) {
		arr[i][0]=sc.nextInt();
		arr[i][1]=sc.nextInt();
		
	}
for(int i=0;i<n;i++) {
	int str=arr[i][0];
	int end=arr[i][1];
	long count=arr1[end-str];
	System.out.println(count);
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.step1();
	}

}