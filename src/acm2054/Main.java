package acm2054;//Accepted

import java.math.BigDecimal;

import java.util.Scanner;

public class Main {
public void S() {
	 Scanner sc = new Scanner(System.in);
	 while(sc.hasNext()) {
		 String a=sc.next();
		 String b=sc.next();
		 BigDecimal bigA=new BigDecimal(a);
		 BigDecimal bigB=new BigDecimal(b);
		 if(bigA.compareTo(bigB)==0) {
			 System.out.println("YES");
		 }
		 else {
			 System.out.println("NO");
		 }
		 sc.close();
	 }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
		ma.S();
	}

}
