package acm2096;//Accepted

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 int T=sc.nextInt();
	 while(T>0){
 int a=sc.nextInt()%100;
 int b=sc.nextInt()%100;
 System.out.println((a+b)%100);

		 T--;
	 }
}
}
