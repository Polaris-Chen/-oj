package acm2075;//Accepted

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 int T=sc.nextInt();
 while(T>0){
	 long a=sc.nextLong();
	 long b=sc.nextLong();
	 if(a%b==0) {
		 System.out.println("YES");
	 }
	 else System.out.println("NO");
	 
	 T--;
 }
	}

}
