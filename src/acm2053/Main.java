package acm2053;

import java.util.Scanner;



public class Main {
public int son(int n) {
	
	int k=0;
	for(int i=1;i<n+1;i++) {
		if(n%i==0) {
			k++;
		}
	}
	return k;
}
	public void S() {
		 Scanner sc = new Scanner(System.in);
		 while(sc.hasNext()) {
			 int n=sc.nextInt();
			 if(son(n)%2==0) {
				 System.out.println(0);
			 }
			 else System.out.println(1);
		 }
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
		ma.S();
	}

}
