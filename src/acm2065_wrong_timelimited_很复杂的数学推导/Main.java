package acm2065_wrong_timelimited_很复杂的数学推导;

import java.math.BigInteger;
import java.util.Scanner;



public class Main {
	public BigInteger pow(BigInteger s) {
		BigInteger sum=new BigInteger("1");
		for(BigInteger a=new BigInteger("0");a.compareTo(s)<0;a=a.add(new BigInteger("1"))) {
			sum=sum.multiply(new BigInteger("2"));
		}
		return sum;
	}
	public BigInteger C(BigInteger n,BigInteger m) {
		BigInteger sum=new BigInteger("1");
		BigInteger sumtop=A(n,m);
		BigInteger sumdown=A(m,m);
		sum=sumtop.divide(sumdown);
		return sum;
	}
	public BigInteger A(BigInteger n,BigInteger m) {
		//if(m.compareTo(new BigInteger("0"))==0) {return new BigInteger("0");}
		BigInteger sum=new BigInteger("1");
		for(BigInteger i=new BigInteger("0");i.compareTo(m)<0;i=i.add(new BigInteger("1"))) {
			sum=sum.multiply(n);
			n=n.subtract(new BigInteger("1"));
		}
		//System.out.println(sum);
		return sum;
		
	}
	public void sum(String x ) {
		BigInteger N=new BigInteger(x);
		BigInteger sum=new BigInteger("0");
		
		for(BigInteger a=new BigInteger("0");a.compareTo(N)<=0;a=a.add(new BigInteger("2"))) {
			for(BigInteger c=new BigInteger("0");c.compareTo(N)<=0;c=c.add(new BigInteger("2"))) {
				if(a.add(c).compareTo(N)>0) {
					break;
				}
				BigInteger suma=C(N,a);
				BigInteger sumc=C(N.subtract(a),c);
				BigInteger lastbd=N.subtract(a).subtract(c);
				BigInteger sumbd=pow(lastbd);
				sum=sum.add(suma.multiply(sumc).multiply(sumbd));
						
				//sum=sum.add((A(N,a).add(A(N.subtract(a),c))).multiply(pow(N.subtract(a).subtract(c))));
				//System.out.println(sum);
				//sum=sum.add(pow(N.subtract(a).subtract(c)));
				//System.out.println(sum);
				//System.out.println(N.subtract(a).subtract(c)));
			}
		}
		String result=String.valueOf(sum);
		if(result.length()<2) {
			System.out.print(result);
		}
		else {
		String q=result.substring(result.length()-2);
		System.out.print(q);
		}
	}
	public void S() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N=sc.nextInt();
			if(N==0) {
				break;
			}
			String[] arr=new String[N];
			for(int i=0;i<N;i++) {
				arr[i]=sc.next();
			}
			for(int i=0;i<N;i++) {
				int a=i+1;
				System.out.print("Case"+a+": ");
				sum(arr[i]);
				System.out.println();
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
		
		//System.out.println(ma.A(new BigInteger("3"), new BigInteger("0")));
	
		ma.S();
	}

}
