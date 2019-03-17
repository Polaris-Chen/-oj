package acm2026;

import java.util.Scanner;

public class Main {
	public void fristBig() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()) {
			String[] arr=sc.nextLine().split("\\s+");
			
				for(int i=0;i<arr.length;i++) {
				  char s=arr[i].charAt(0);
				  String bigS=String.valueOf(Character.toUpperCase(s));
				  arr[i]=arr[i].replaceFirst(String.valueOf(s), bigS);
				
				}
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j]);
				if(j!=arr.length-1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	Main ma=new Main();
	ma.fristBig();
}
}
