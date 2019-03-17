package acm2045;//Accepted
//这里用了递推式 下次碰到这种题目就先去分析 n-1和n-2的情况

import java.util.Scanner;

public class Main {
public void RPG() {
	 Scanner sc = new Scanner(System.in);
	 while(sc.hasNext()) {
		 int n=sc.nextInt();
		 if(n==1) {
			 System.out.println(3);
			 continue;
		 }
		 else if(n==2) {System.out.println(6);continue;}
		 else if(n==3) {System.out.println(6);continue;}
		 long[] arr=new long[n+1];
		 arr[1]=3;arr[2]=6;arr[3]=6;
		
		 for(int i=4;i<n+1;i++) {
			 arr[i]=arr[i-1]+arr[i-2]*2;
		 }
		 System.out.println(arr[n]);
	 }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.RPG();
	}

}
