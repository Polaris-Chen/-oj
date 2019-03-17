package acm2081;//Accepted

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int T=sc.nextInt();
		 while(T>0){
			 String s=sc.next();
			 s="6"+s.substring(6, 11);
			 System.out.println(s);
			 T--;
		 }
	}

}
