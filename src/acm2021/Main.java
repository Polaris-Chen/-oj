package acm2021;

import java.util.Scanner;//Accepted

public class Main {
public void scoreOfMoney() {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
		int n=sc.nextInt();
		if(n==0) {
			break;
		}
		int count=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			int x=arr[j];
			if(x>=100) {
				count+=x/100;
				x=x-(x/100)*100;
			}
			if(x>=50) {
				count++;
				x=x-50;
			}
			if(x>=10) {
				count+=x/10;
				x=x-(x/10)*10;
			}
			if(x>=5) {
				count++;
				x=x-5;
			}
			if(x>=2) {
				count+=x/2;
				x=x-(x/2)*2;
			}
			count+=x;
		}
		System.out.println(count);
	}
}
	
	public static void main(String[] args) {
	Main ma=new Main();
	ma.scoreOfMoney();
}
}
