package acm2012;//Accepted
//主要是判断素数的方法 就一个个除  然后非素数一定有一个小于根号n的因子
import java.util.Scanner;

public class Main {

	int bool_su(double a) {
		for(int i=2;i<=Math.pow(a,0.5);i++) {
			if(a%i==0) {
				return 0;
			}
		}return 1;
	}
	
	public double way(int n) {
	     double x=Math.pow(n,2)+n+41;
	     return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Main ma=new Main();
		while(sc.hasNext()) {
			int mark=1;
			int left=sc.nextInt();
			int right=sc.nextInt();
			if(left==0&&right==0)break;
			for(int i=left;i<right+1;i++) {
				if(ma.bool_su(ma.way(i))==0)
					mark=0;
			}
			if(mark==1) {System.out.println("OK");
			}
			else {System.out.println("Sorry");
			}
			
		}
	}

}
