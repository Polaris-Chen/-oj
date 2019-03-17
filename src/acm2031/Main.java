package acm2031;//Accepted

import java.util.Scanner;

public class Main {
public void change() {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int N=sc.nextInt(),i=0;
		int R=sc.nextInt();
		String[] arr=new String[60];
		if(N<0) {
			System.out.print("-");
			N=Math.abs(N);
		}
		while(N!=0) {
			
			int score=N%R;
			N=N/R;
			char charScore='A';
			if(score<10) {
			arr[i]=String.valueOf(score);
			i++;
			}
			else {
				switch(score) {
				case 10:
					charScore='A';
					break;
				case 11:
					charScore='B';
					break;
				case 12:
					charScore='C';
					break;
				case 13:
					charScore='D';
					break;
				case 14:
					charScore='E';
					break;
				case 15:
					charScore='F';
					break;
					
				}
				arr[i]=String.valueOf(charScore);
				i++;
			}
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(arr[j]);
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
