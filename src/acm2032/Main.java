package acm2032;//Accepted

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public BigInteger  mulitiply(int n,int cishu) {
		BigInteger mulitiply=new BigInteger("1");
		
		while(cishu>0) {
			mulitiply=mulitiply.multiply(new BigInteger(String.valueOf(n)));
			n--;
			cishu--;
		}
		return mulitiply;
	}
public String C(int n,int m) {
	BigInteger scoreUp,scoreDown;
	scoreUp=mulitiply(n,m);
	scoreDown=mulitiply(m,m);
	return String.valueOf(scoreUp.divide(scoreDown));
	
}
public void yangHui() {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
		int n=sc.nextInt();
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(C(i-1,j-1));
				if(j!=i)System.out.print(" ");
				else System.out.println();
			}
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.yangHui();
	}

}
