package acm2008;//Accepted

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
		
			int postive=0,zero=0,impostive=0;
			int n=sc.nextInt();
			if(n==0) break;
			String[] arr=sc.nextLine().split("\\s+");
			for(int i=1;i<n+1;i++) {
				double j=Double.parseDouble(arr[i]);
				if(j>0) {
					postive++;
				}
				else if(j<0){
					impostive++;
				}
				else zero++;
			}
			System.out.println(impostive+" "+zero+" "+postive);
		}
	}

}
