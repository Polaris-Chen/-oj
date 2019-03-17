package acm2052;//Accepted

import java.util.Scanner;

public class Main {

	public void rectangle() {
		 Scanner sc = new Scanner(System.in);
		 while(sc.hasNext()) {
			 int m=sc.nextInt();
			 int n=sc.nextInt();
			 String[][] arr=new String[n+2][m+2];
			 
			 for(int i=0;i<n+2;i++) {
				 for(int j=0;j<m+2;j++) {
					 if(i==0&&j==0)
						 {arr[i][j]="+";continue;}
					 else if(i==0&&j==m+1) 
						 {arr[i][j]="+";continue;}
					 else if(i==n+1&&j==0)
						 {arr[i][j]="+";continue;}
					 else if(i==n+1&&j==m+1) 
						 {arr[i][j]="+";continue;}
					 
					 
					 if(i==0||i==n+1) {
						 arr[i][j]="-";
						 continue;
					 }
					 else if(j==0||j==m+1) {
						 arr[i][j]="|";
						 continue;
					 }
					 
					 arr[i][j]=" ";
					 
				 }
			 }
			 for(int i=0;i<n+2;i++) {
				 for(int j=0;j<m+2;j++) {
				 System.out.print(arr[i][j]);
				 
				 }
					System.out.println(); 
				 }
			 System.out.println();
		 }
		 sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.rectangle();
	}

}
