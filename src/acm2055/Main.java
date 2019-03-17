package acm2055;//Accepted

import java.util.Scanner;


public class Main {
	public void S()  {
		 Scanner sc = new Scanner(System.in);
		 while(sc.hasNext()) {
			 int T=sc.nextInt();
			 int[][] arr=new int[T][2];
			 for(int i=0;i<T;i++) {
			 String sx=sc.next();
			 arr[i][0]=sx.charAt(0);
			 arr[i][1]=sc.nextInt();
			 
			 }
			 for(int j=0;j<T;j++) {
			 int data=0;
			 if(Character.isUpperCase(arr[j][0])) {
				 data=arr[j][0]-64;
			 }
			 else {
				 data=-(arr[j][0]-96);
			 }
			 System.out.println(data+arr[j][1]);
			 }
		 }
		 }
	public static void main(String[] args) {
		Main ma=new Main();
		ma.S();
		// TODO Auto-generated method stub
//ะกะด97-122
//ด๓ะด65-90

	}

}
