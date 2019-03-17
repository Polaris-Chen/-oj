package acm2006;

import java.util.Scanner;

public class Main {
	public void allOdds() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {//±ðÓÃhasNextLine()
			int n=sc.nextInt();
			int X=1;
			
			String[] arr=sc.nextLine().split("\\s+");
			//System.out.println(arr[0]);
			for(int i=1;i<n+1;i++) {
				if(Integer.parseInt(arr[i])%2!=0) {
					X*=Integer.parseInt(arr[i]);
				}
			}
			System.out.println(X);
		}
	}
public static void main(String[] args) {
	Main ma=new Main();
	ma.allOdds();
}
}
