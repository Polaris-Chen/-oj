package acm2035;//Accepted

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
public void lastThree() {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==0&b==0) {
			break;
		}
		BigInteger bi=new BigInteger("1");
		for(int i=1;i<b+1;i++) {
			bi=bi.multiply(new BigInteger(String.valueOf(a)));
		}
		BigInteger no1=bi.subtract(bi.divide(new BigInteger("10")).multiply(new BigInteger("10")));
		bi=bi.subtract(no1);
		BigInteger no2=bi.subtract(bi.divide(new BigInteger("100")).multiply(new BigInteger("100")));
		
		bi.subtract(no2);
		no2=no2.divide(new BigInteger("10"));
		BigInteger no3=bi.subtract(bi.divide(new BigInteger("1000")).multiply(new BigInteger("1000")));
		no3=no3.divide(new BigInteger("100"));
		String no_1=String.valueOf(no1);
		String no_2=String.valueOf(no2);
		String no_3=String.valueOf(no3);
		System.out.println(Integer.valueOf(no_3+no_2+no_1));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.lastThree();
	}

}
