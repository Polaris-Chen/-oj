package acm2051;//Accepted

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(sc.hasNext()) {
	int a=sc.nextInt();
	int[] arr=new int[1000];
	int i=0;
	while(a>0) {
		
		arr[i]=a%2;
		a=a/2;
		i++;
	}
	for(int j=i-1;j>=0;j--) {
		
	
	System.out.print(arr[j]);
}
	System.out.println();
}}

}
