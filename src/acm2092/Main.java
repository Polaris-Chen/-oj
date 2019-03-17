package acm2092;//Accepted

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()) {
			int p1=sc.nextInt();
			int p2=sc.nextInt();
			if(p1==0&&p2==0)break;
			double deta=Math.sqrt(p1*p1-4*p2);
			if(deta!=(int)deta) {
				System.out.println("No");
			}
			else {
				double x1=-p1+deta;
				double x2=-p2-deta;
				if(x1==(int)x1&&x2==(int)x2) {
					System.out.println("Yes");
				}
				else System.out.println("No");
			}
		}
	}

}
