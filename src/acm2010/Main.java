package acm2010;

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int left=sc.nextInt();
		int right=sc.nextInt();
		int mark=0,hun=0,ten=0,single=0;
		for(int i=left;i<right+1;i++) {
			hun=i/100;
			single=i-(i/10)*10;
			ten=(i-(i/100)*100-single)/10;
			
			if(Math.pow(hun, 3)+Math.pow(ten, 3)+Math.pow(single, 3)==i) {
				
				mark++;
				if(mark==1) {
					System.out.print(i);
				}
				else System.out.print(" "+i);
			}
			
		}
		
		if(mark==0) {
			System.out.println("no");
		}else System.out.println();//重点在于有水仙花数的情况时最后要换行
	}
}
}

