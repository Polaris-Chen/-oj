package acm2099;//Accepted
import java.util.*;
public class Main {
public void S() {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		String a=sc.next();
		int b=sc.nextInt();
		if(a.compareTo("0")==0&&b==0) {
			break;
		}
		boolean flag=false;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				//String temp1=String.valueOf(i)+String.valueOf(j);
				//System.out.println(temp1);
				String temp=a+i+j;
				//System.out.println(temp);
				int tempInt=Integer.parseInt(temp);
				if(tempInt%b==0) {
					if(!flag) {
						System.out.print(i);
						System.out.print(j);
						flag=true;
					}
					else {System.out.print(" "+i);
					System.out.print(j);
					}
				}
			}
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.S();
	}

}
