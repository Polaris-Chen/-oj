package acm2058;//根据等差求和公式可得出 n*(2*a1-1+n)=2*m
//所以 n会小于 2*m 开根号 
//所以从1到max遍历
//看看这个长度算出的a1是否为整数


import java.util.Scanner;

public class Main {
	public void S()  {
		 Scanner sc = new Scanner(System.in);
		
		 while(sc.hasNext()) {
		 long n=sc.nextLong();
		 long m=sc.nextLong();
		if(m==0&n==0) {
			break;
		}
		long max=(long)Math.sqrt(2*m);
		for(long i=max;i>0;i--) {
			if((2*m+i-i*i)%(2*i)==0) {
				long a=(2*m+i-i*i)/(2*i);
				long s=a+i-1;
				System.out.println("["+a+","+s+"]");
			}
		}
			/*
			 * for(long i=1;i<n;i++) { if(i>m)break; long x=i-i*i-2*m; long
			 * x1=(long)(Math.pow(1-x*4, 0.5)-1)/2; long sum=((x1-i+1)*(x1+i))/2; if(sum==m)
			 * { System.out.println("["+i+","+x1+"]"); }
			 * 
			 * 大数乘法其实更耗费时间
			 * }
			 */
		
		
			/*
			 * //超过时间了 for(long i=1;i<n;i++) { if(i>m/2) {
			 * System.out.println("["+m+","+m+"]"); break; }
			 * 
			 * long sum=0; long mark=i; while(sum<m) { sum+=mark; mark++; }
			 * 
			 * mark--; if(sum==m) { System.out.println("["+i+","+mark+"]"); } }
			 */
			 
		 System.out.println();
		 }
		 }
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Main ma=new Main();
	ma.S();
}
}
